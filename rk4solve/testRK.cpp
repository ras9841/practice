#include <iostream>
#include "rk4solve.h"

double dydx(double y, double t)
{
    return 2;
}

int main()
{
    double t_0 = 0, t_f = 10, h = 1;
    double y[(int)((t_f-t_0)/h)+1];

    // Initial condition
    double y0 = 0;
    y[0] = y0;

    std::cout << "Testing \n";
    double t;
    int i = 1;
    while (t<t_f+h)
    {
        y0 = y[(i++)-1];
        rk4solve(y0, t, h, &dydx);
        t += h;
    }
    return 0;
}
