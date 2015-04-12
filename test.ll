@.format_str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.strdouble = private unnamed_addr constant [4 x i8] c"%lf\00", align 1
@.strint = private unnamed_addr constant [3 x i8] c"%d\00", align 1
define i32 @main() nounwind {
%a = alloca double, align 4
%b = alloca double, align 4
store double 3.11, double* %a, align 4
store double 5.34, double* %b, align 4
%c = alloca i32, align 4
store i32 7, i32* %c, align 4
%d = alloca double, align 4
%1 = load double* %a, align 8
%2 = fmul double 2.0e+00, %1
%3 = fmul double 4.0e+00, 5.0e+00
%4 = fmul double %3, 5.21e+00
%5 = load double* %a, align 8
%6 = load double* %b, align 8
%7 = load i32* %c, align 4
%8 = sitofp i32 %7 to double
%9 = fmul double %6, %8
%10 = load double* %a, align 8
%11 = fmul double 3.21e+00, %10
%12 = load i32* %c, align 4
%13 = sitofp i32 %12 to double
%14 = fmul double 4.32e+00, %13
%15 = load double* %a, align 8
%16 = load double* %b, align 8
%17 = load double* %a, align 8
%18 = load i32* %c, align 4
%19 = sitofp i32 %18 to double
%20 = fdiv double %16, 4.0e+00
%21 = fdiv double %20, %17
%22 = fmul double %21, %19
%23 = fadd double %2, %4
%24 = fsub double %23, %5
%25 = fadd double %24, %9
%26 = fadd double %25, %11
%27 = fsub double %26, %14
%28 = fadd double %27, %15
%29 = fadd double %28, %22
%30 = fsub double %29, 43.0e+00
store double %30, double* %d, align 4
%31= load double* %d, align 4
%32= call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.strdouble, i32 0, i32 0), double %31)
ret i32 0
}
declare i32 @__isoc99_scanf(i8*, ...)
declare i32 @printf(i8*, ...)
