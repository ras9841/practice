#include <iostream>
#include <stdio.h>
#include <math.h>
#include "rk4solve.h"

double dydx(double y, double t)
{
    return 1+sqrt(y);
}

int main()
{
    // Parameters
    double t_0 = 0, t_f = 2, h = 0.001;

    // Initialization
    int num_steps = (int)((t_f-t_0)/h)+1;
    double y[num_steps], time[num_steps];

    // Initial condition
    double y0 = 0;
    y[0] = y0;
    time[0] = t_0;

    double t = t_0;
    int i = 1;
    while (t<t_f+h)
    {
        y0 = y[i-1];
        y[i] = rk4solve(y0, t, h, &dydx);
        
        t += h;
        time[i++] = t; 
    }

    // Write out result
    FILE *f;
    f = fopen("results.csv", "w");
    if (f != NULL)
    {
        for (size_t i=0; i<num_steps; i++)
        {
            fprintf(f, "%f,%f\n", time[i], y[i]); 
        }
    }
    fclose(f);

    return 0;
}
