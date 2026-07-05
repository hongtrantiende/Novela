package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeMath extends ScriptableObject {
    private static final Double Double32 = Double.valueOf(32.0d);
    private static final double LOG2E = 1.4426950408889634d;
    private static final String MATH_TAG = "Math";
    private static final long serialVersionUID = -8838847185801131569L;

    private NativeMath() {
    }

    public static Object abs(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number == 0.0d) {
            number = 0.0d;
        } else if (number < 0.0d) {
            number = -number;
        }
        return ScriptRuntime.wrapNumber(number);
    }

    public static Object acos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number) && -1.0d <= number && number <= 1.0d) {
            d = Math.acos(number);
        } else {
            d = Double.NaN;
        }
        return ScriptRuntime.wrapNumber(d);
    }

    public static Object acosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number)) {
            return Double.valueOf(Math.log(Math.sqrt((number * number) - 1.0d) + number));
        }
        return ScriptRuntime.NaNobj;
    }

    public static Object asin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number) && -1.0d <= number && number <= 1.0d) {
            d = Math.asin(number);
        } else {
            d = Double.NaN;
        }
        return ScriptRuntime.wrapNumber(d);
    }

    public static Object asinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isInfinite(number)) {
            return Double.valueOf(number);
        }
        if (!Double.isNaN(number)) {
            if (number == 0.0d) {
                if (1.0d / number > 0.0d) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Double.valueOf(Math.log(Math.sqrt((number * number) + 1.0d) + number));
        }
        return ScriptRuntime.NaNobj;
    }

    public static Object atan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.atan(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object atan2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.atan2(ScriptRuntime.toNumber(objArr, 0), ScriptRuntime.toNumber(objArr, 1)));
    }

    public static Object atanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number) && -1.0d <= number && number <= 1.0d) {
            if (number == 0.0d) {
                if (1.0d / number > 0.0d) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Double.valueOf(Math.log((number + 1.0d) / (1.0d - number)) * 0.5d);
        }
        return ScriptRuntime.NaNobj;
    }

    public static Object cbrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.cbrt(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object ceil(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.ceil(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object clz32(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i = 0;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number != 0.0d && !Double.isNaN(number) && !Double.isInfinite(number)) {
            long uint32 = ScriptRuntime.toUint32(number);
            if (uint32 == 0) {
                return Double32;
            }
            if (((-65536) & uint32) != 0) {
                i = 16;
                uint32 >>>= 16;
            }
            if ((65280 & uint32) != 0) {
                i += 8;
                uint32 >>>= 8;
            }
            if ((240 & uint32) != 0) {
                i += 4;
                uint32 >>>= 4;
            }
            if ((12 & uint32) != 0) {
                i += 2;
                uint32 >>>= 2;
            }
            if ((2 & uint32) != 0) {
                i++;
                uint32 >>>= 1;
            }
            if ((uint32 & 1) != 0) {
                i++;
            }
            return Double.valueOf(32 - i);
        }
        return Double32;
    }

    public static Object cos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double cos;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isInfinite(number)) {
            cos = Double.NaN;
        } else {
            cos = Math.cos(number);
        }
        return ScriptRuntime.wrapNumber(cos);
    }

    public static Object cosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.cosh(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object exp(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number != Double.POSITIVE_INFINITY) {
            if (number == Double.NEGATIVE_INFINITY) {
                number = 0.0d;
            } else {
                number = Math.exp(number);
            }
        }
        return ScriptRuntime.wrapNumber(number);
    }

    public static Object expm1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.expm1(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object floor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.floor(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object fround(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber((float) ScriptRuntime.toNumber(objArr, 0));
    }

    public static Object hypot(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d = 0.0d;
        if (objArr == null) {
            return Double.valueOf(0.0d);
        }
        boolean z = false;
        boolean z2 = false;
        for (Object obj : objArr) {
            double number = ScriptRuntime.toNumber(obj);
            if (Double.isNaN(number)) {
                z2 = true;
            } else if (Double.isInfinite(number)) {
                z = true;
            } else {
                d = (number * number) + d;
            }
        }
        if (z) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if (z2) {
            return Double.valueOf(Double.NaN);
        }
        return Double.valueOf(Math.sqrt(d));
    }

    public static Object imul(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return ScriptRuntime.wrapNumber(ScriptRuntime.toInt32(objArr, 1) * ScriptRuntime.toInt32(objArr, 0));
    }

    public static void init(Scriptable scriptable, boolean z) {
        NativeMath nativeMath = new NativeMath();
        nativeMath.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeMath.setParentScope(scriptable);
        nativeMath.defineProperty("toSource", MATH_TAG, 7);
        nativeMath.defineProperty(scriptable, "abs", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "acos", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "acosh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "asin", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "asinh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "atan", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "atanh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "atan2", 2, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "cbrt", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "ceil", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "clz32", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "cos", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "cosh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "exp", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "expm1", 1, new j(0), 2, 3);
        nativeMath.defineProperty(scriptable, "floor", 1, new j(1), 2, 3);
        nativeMath.defineProperty(scriptable, "fround", 1, new j(2), 2, 3);
        nativeMath.defineProperty(scriptable, "hypot", 2, new j(3), 2, 3);
        nativeMath.defineProperty(scriptable, "imul", 2, new j(4), 2, 3);
        nativeMath.defineProperty(scriptable, "log", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "log1p", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "log10", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "log2", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "max", 2, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "min", 2, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "pow", 2, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "random", 0, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "round", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "sign", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "sin", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "sinh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "sqrt", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "tan", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "tanh", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "trunc", 1, new Callable() { // from class: org.mozilla.javascript.i
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object abs;
                Object log;
                Object acos;
                Object log1p;
                Object log10;
                Object log2;
                Object max;
                Object min;
                Object pow;
                Object random;
                Object round;
                Object clz32;
                Object sign;
                Object sin;
                Object acosh;
                Object sinh;
                Object sqrt;
                Object tan;
                Object tanh;
                Object trunc;
                Object asin;
                Object asinh;
                Object cos;
                Object atan;
                Object atanh;
                Object atan2;
                Object cbrt;
                Object ceil;
                Object cosh;
                Object exp;
                switch (r1) {
                    case 0:
                        abs = NativeMath.abs(context, scriptable2, scriptable3, objArr);
                        return abs;
                    case 1:
                        log = NativeMath.log(context, scriptable2, scriptable3, objArr);
                        return log;
                    case 2:
                        acos = NativeMath.acos(context, scriptable2, scriptable3, objArr);
                        return acos;
                    case 3:
                        log1p = NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                        return log1p;
                    case 4:
                        log10 = NativeMath.log10(context, scriptable2, scriptable3, objArr);
                        return log10;
                    case 5:
                        log2 = NativeMath.log2(context, scriptable2, scriptable3, objArr);
                        return log2;
                    case 6:
                        max = NativeMath.max(context, scriptable2, scriptable3, objArr);
                        return max;
                    case 7:
                        min = NativeMath.min(context, scriptable2, scriptable3, objArr);
                        return min;
                    case 8:
                        pow = NativeMath.pow(context, scriptable2, scriptable3, objArr);
                        return pow;
                    case 9:
                        random = NativeMath.random(context, scriptable2, scriptable3, objArr);
                        return random;
                    case 10:
                        round = NativeMath.round(context, scriptable2, scriptable3, objArr);
                        return round;
                    case 11:
                        clz32 = NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                        return clz32;
                    case 12:
                        sign = NativeMath.sign(context, scriptable2, scriptable3, objArr);
                        return sign;
                    case 13:
                        sin = NativeMath.sin(context, scriptable2, scriptable3, objArr);
                        return sin;
                    case 14:
                        acosh = NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                        return acosh;
                    case 15:
                        sinh = NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                        return sinh;
                    case 16:
                        sqrt = NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                        return sqrt;
                    case 17:
                        tan = NativeMath.tan(context, scriptable2, scriptable3, objArr);
                        return tan;
                    case 18:
                        tanh = NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                        return tanh;
                    case 19:
                        trunc = NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                        return trunc;
                    case 20:
                        asin = NativeMath.asin(context, scriptable2, scriptable3, objArr);
                        return asin;
                    case 21:
                        asinh = NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                        return asinh;
                    case 22:
                        cos = NativeMath.cos(context, scriptable2, scriptable3, objArr);
                        return cos;
                    case 23:
                        atan = NativeMath.atan(context, scriptable2, scriptable3, objArr);
                        return atan;
                    case 24:
                        atanh = NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                        return atanh;
                    case 25:
                        atan2 = NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                        return atan2;
                    case 26:
                        cbrt = NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                        return cbrt;
                    case 27:
                        ceil = NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                        return ceil;
                    case 28:
                        cosh = NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                        return cosh;
                    default:
                        exp = NativeMath.exp(context, scriptable2, scriptable3, objArr);
                        return exp;
                }
            }
        }, 2, 3);
        nativeMath.defineProperty("E", Double.valueOf(2.718281828459045d), 7);
        nativeMath.defineProperty("PI", Double.valueOf(3.141592653589793d), 7);
        nativeMath.defineProperty("LN10", Double.valueOf(2.302585092994046d), 7);
        nativeMath.defineProperty("LN2", Double.valueOf(0.6931471805599453d), 7);
        nativeMath.defineProperty("LOG2E", Double.valueOf((double) LOG2E), 7);
        nativeMath.defineProperty("LOG10E", Double.valueOf(0.4342944819032518d), 7);
        nativeMath.defineProperty("SQRT1_2", Double.valueOf(0.7071067811865476d), 7);
        nativeMath.defineProperty("SQRT2", Double.valueOf(1.4142135623730951d), 7);
        nativeMath.defineProperty(SymbolKey.TO_STRING_TAG, MATH_TAG, 3);
        ScriptableObject.defineProperty(scriptable, MATH_TAG, nativeMath, 2);
        if (z) {
            nativeMath.sealObject();
        }
    }

    public static Object log(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double log;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number < 0.0d) {
            log = Double.NaN;
        } else {
            log = Math.log(number);
        }
        return ScriptRuntime.wrapNumber(log);
    }

    public static Object log10(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.log10(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object log1p(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.log1p(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object log2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double log;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number < 0.0d) {
            log = Double.NaN;
        } else {
            log = Math.log(number) * LOG2E;
        }
        return ScriptRuntime.wrapNumber(log);
    }

    public static Object max(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d = Double.NEGATIVE_INFINITY;
        for (int i = 0; i != objArr.length; i++) {
            d = Math.max(d, ScriptRuntime.toNumber(objArr[i]));
        }
        return ScriptRuntime.wrapNumber(d);
    }

    public static Object min(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d = Double.POSITIVE_INFINITY;
        for (int i = 0; i != objArr.length; i++) {
            d = Math.min(d, ScriptRuntime.toNumber(objArr[i]));
        }
        return ScriptRuntime.wrapNumber(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x006d, code lost:
        if (r1 < 1.0d) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0087, code lost:
        if (r1 < 1.0d) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x008e, code lost:
        if (r0 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a5, code lost:
        if (r0 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0032, code lost:
        if (r0 > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object pow(org.mozilla.javascript.Context r24, org.mozilla.javascript.Scriptable r25, org.mozilla.javascript.Scriptable r26, java.lang.Object[] r27) {
        /*
            r0 = r27
            r1 = 0
            double r1 = org.mozilla.javascript.ScriptRuntime.toNumber(r0, r1)
            r3 = 1
            double r3 = org.mozilla.javascript.ScriptRuntime.toNumber(r0, r3)
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto L14
            goto Laa
        L14:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 != 0) goto L1f
            r3 = r7
            goto Laa
        L1f:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r10 = -9223372036854775808
            r12 = 0
            r14 = 1
            r16 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r18 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            if (r9 != 0) goto L4e
            double r7 = r7 / r1
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L35
            if (r0 <= 0) goto L71
            goto L6f
        L35:
            long r1 = (long) r3
            double r7 = (double) r1
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L48
            long r1 = r1 & r14
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L48
            if (r0 <= 0) goto L43
            goto L45
        L43:
            r10 = r16
        L45:
            r3 = r10
            goto Laa
        L48:
            if (r0 <= 0) goto L4b
            goto L6f
        L4b:
            r5 = r18
            goto L6f
        L4e:
            double r20 = java.lang.Math.pow(r1, r3)
            boolean r9 = java.lang.Double.isNaN(r20)
            if (r9 == 0) goto La8
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            r22 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r9 != 0) goto L74
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 < 0) goto L71
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L67
            goto L71
        L67:
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto La8
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto La8
        L6f:
            r3 = r5
            goto Laa
        L71:
            r3 = r18
            goto Laa
        L74:
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r9 != 0) goto L8a
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 < 0) goto L6f
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L81
            goto L6f
        L81:
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto La8
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto La8
            goto L71
        L8a:
            int r7 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r7 != 0) goto L91
            if (r0 <= 0) goto L6f
            goto L71
        L91:
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto La8
            long r1 = (long) r3
            double r7 = (double) r1
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto La5
            long r1 = r1 & r14
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto La5
            if (r0 <= 0) goto L45
            r3 = r16
            goto Laa
        La5:
            if (r0 <= 0) goto L6f
            goto L71
        La8:
            r3 = r20
        Laa:
            java.lang.Number r0 = org.mozilla.javascript.ScriptRuntime.wrapNumber(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeMath.pow(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    public static Object random(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.random());
    }

    public static Object round(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number) && !Double.isInfinite(number)) {
            long round = Math.round(number);
            if (round != 0) {
                number = round;
            } else if (number < 0.0d) {
                number = ScriptRuntime.negativeZero;
            } else if (number != 0.0d) {
                number = 0.0d;
            }
        }
        return ScriptRuntime.wrapNumber(number);
    }

    public static Object sign(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number)) {
            if (number == 0.0d) {
                if (1.0d / number > 0.0d) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Double.valueOf(Math.signum(number));
        }
        return ScriptRuntime.NaNobj;
    }

    public static Object sin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double sin;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isInfinite(number)) {
            sin = Double.NaN;
        } else {
            sin = Math.sin(number);
        }
        return ScriptRuntime.wrapNumber(sin);
    }

    public static Object sinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.sinh(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object sqrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.sqrt(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object tan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.tan(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object tanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.tanh(ScriptRuntime.toNumber(objArr, 0)));
    }

    public static Object trunc(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double floor;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number < 0.0d) {
            floor = Math.ceil(number);
        } else {
            floor = Math.floor(number);
        }
        return ScriptRuntime.wrapNumber(floor);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return MATH_TAG;
    }
}
