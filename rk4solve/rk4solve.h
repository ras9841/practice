#ifndef __RK4__
#define __RK4__
double rk4solve(double y0, double t, double h, double (*deriv)(double, double));
#endif
