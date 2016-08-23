double rk4solve(double yn, double t, double h, double (*deriv)(double, double))
{
    double k1, k2, k3, k4; 
    
    k1 = deriv(yn, t); 
    k2 = deriv(yn+(h/2)*k1, t+h/2); 
    k3 = deriv(yn+(h/2)*k2, t+h/2); 
    k4 = deriv(yn+h*k3, t+h); 

    return yn + (h/6)*(k1 + 2*k2 + 2*k3 + k4);
}
