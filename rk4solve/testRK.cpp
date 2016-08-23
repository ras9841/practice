#include <iostream>
#include "rk4solve.h"

double dydx(double y, double t)
{
    return 2;
}

int main()
{
    double t_0 = 0, t_f = 10, h = 1;
    int num_steps = (int)((t_f-t_0)/h)+1;
    double y[num_steps], time[num_steps];

    // Initial condition
    double y0 = 0;
    y[0] = y0;
    time[0] = t_0;

    std::cout << "Testing \n";
    double t = t_0;
    int i = 1;
    while (t<t_f+h)
    {
        y0 = y[i-1];
        y[i] = rk4solve(y0, t, h, &dydx);
        
        t += h;
        time[i++] = t; 
    }

    for (int i=0; i<num_steps; i++)
    {
        std::cout << "t=" << time[i] << "\t";
        std::cout << "y=" << y[i] << "\n";
    }

    return 0;
}
