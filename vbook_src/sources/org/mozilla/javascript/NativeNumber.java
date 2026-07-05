package org.mozilla.javascript;

import org.mozilla.javascript.dtoa.DecimalFormatter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeNumber extends IdScriptableObject {
    private static final int ConstructorId_isFinite = -1;
    private static final int ConstructorId_isInteger = -3;
    private static final int ConstructorId_isNaN = -2;
    private static final int ConstructorId_isSafeInteger = -4;
    private static final double EPSILON = 2.220446049250313E-16d;
    private static final int Id_constructor = 1;
    private static final int Id_toExponential = 7;
    private static final int Id_toFixed = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toPrecision = 8;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 5;
    private static final int MAX_PRECISION = 100;
    private static final int MAX_PROTOTYPE_ID = 8;
    public static final double MAX_SAFE_INTEGER = 9.007199254740991E15d;
    private static final double MIN_SAFE_INTEGER = -9.007199254740991E15d;
    private static final Object NUMBER_TAG = "Number";
    private static final long serialVersionUID = 3504516769741512101L;
    private double doubleValue;

    public NativeNumber(double d) {
        this.doubleValue = d;
    }

    private static void checkPrecision(double d, double d2, Object obj) {
        if (d >= d2 && d <= 100.0d) {
            return;
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.bad.precision", ScriptRuntime.toString(obj)));
    }

    private static Object execConstructorCall(int i, Object[] objArr) {
        if (i != -4) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        if (objArr.length != 0 && !Undefined.isUndefined(objArr[0])) {
                            Object obj = objArr[0];
                            if (obj instanceof Number) {
                                return isFinite(obj);
                            }
                            return Boolean.FALSE;
                        }
                        return Boolean.FALSE;
                    }
                    vs.m(String.valueOf(i));
                    return null;
                } else if (objArr.length != 0 && !Undefined.isUndefined(objArr[0])) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Number) {
                        return isNaN((Number) obj2);
                    }
                    return Boolean.FALSE;
                } else {
                    return Boolean.FALSE;
                }
            } else if (objArr.length != 0 && !Undefined.isUndefined(objArr[0])) {
                Object obj3 = objArr[0];
                if (obj3 instanceof Number) {
                    return Boolean.valueOf(isInteger((Number) obj3));
                }
                return Boolean.FALSE;
            } else {
                return Boolean.FALSE;
            }
        }
        if (objArr.length != 0) {
            Object obj4 = Undefined.instance;
            Object obj5 = objArr[0];
            if (obj4 != obj5) {
                if (obj5 instanceof Number) {
                    return Boolean.valueOf(isSafeInteger((Number) obj5));
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeNumber(0.0d).exportAsJSClass(8, scriptable, z);
    }

    private static boolean isDoubleInteger(Double d) {
        if (!d.isInfinite() && !d.isNaN() && Math.floor(d.doubleValue()) == d.doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean isDoubleSafeInteger(Double d) {
        if (isDoubleInteger(d) && d.doubleValue() <= 9.007199254740991E15d && d.doubleValue() >= MIN_SAFE_INTEGER) {
            return true;
        }
        return false;
    }

    public static Object isFinite(Object obj) {
        boolean z;
        Double valueOf = Double.valueOf(ScriptRuntime.toNumber(obj));
        if (!valueOf.isInfinite() && !valueOf.isNaN()) {
            z = true;
        } else {
            z = false;
        }
        return ScriptRuntime.wrapBoolean(z);
    }

    private static boolean isInteger(Number number) {
        if (number instanceof Double) {
            return isDoubleInteger((Double) number);
        }
        return isDoubleInteger(number.doubleValue());
    }

    private static Boolean isNaN(Number number) {
        if (number instanceof Double) {
            return Boolean.valueOf(((Double) number).isNaN());
        }
        return Boolean.valueOf(Double.isNaN(number.doubleValue()));
    }

    private static boolean isSafeInteger(Number number) {
        if (number instanceof Double) {
            return isDoubleSafeInteger((Double) number);
        }
        return isDoubleSafeInteger(number.doubleValue());
    }

    private static Object js_toExponential(double d, Object[] objArr) {
        boolean z;
        double d2;
        Object obj;
        int int32;
        if (objArr.length > 0 && !Undefined.isUndefined(objArr[0])) {
            d2 = ScriptRuntime.toInteger(objArr[0]);
            z = false;
        } else {
            z = true;
            d2 = 0.0d;
        }
        if (!Double.isFinite(d)) {
            return ScriptRuntime.toString(d);
        }
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        checkPrecision(d2, 0.0d, obj);
        if (z) {
            int32 = -1;
        } else {
            int32 = ScriptRuntime.toInt32(d2);
        }
        return DecimalFormatter.toExponential(d, int32);
    }

    private static Object js_toFixed(Context context, double d, Object[] objArr) {
        int i;
        int i2 = 0;
        if (objArr.length > 0 && !Undefined.isUndefined(objArr[0])) {
            double integer = ScriptRuntime.toInteger(objArr[0]);
            if (context.version < 200) {
                i = -20;
            } else {
                i = 0;
            }
            checkPrecision(integer, i, objArr[0]);
            i2 = ScriptRuntime.toInt32(integer);
        }
        if (!Double.isFinite(d)) {
            return ScriptRuntime.toString(d);
        }
        return DecimalFormatter.toFixed(d, i2);
    }

    private static Object js_toPrecision(double d, Object[] objArr) {
        if (objArr.length != 0 && !Undefined.isUndefined(objArr[0])) {
            double integer = ScriptRuntime.toInteger(objArr[0]);
            if (!Double.isFinite(d)) {
                return ScriptRuntime.toString(d);
            }
            checkPrecision(integer, 1.0d, objArr[0]);
            return DecimalFormatter.toPrecision(d, ScriptRuntime.toInt32(integer));
        }
        return ScriptRuntime.toString(d);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i;
        double d;
        if (!idFunctionObject.hasTag(NUMBER_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            if (objArr.length >= 1) {
                d = ScriptRuntime.toNumeric(objArr[0]).doubleValue();
            } else {
                d = 0.0d;
            }
            if (scriptable2 == null) {
                return new NativeNumber(d);
            }
            return ScriptRuntime.wrapNumber(d);
        } else if (methodId < 1) {
            return execConstructorCall(methodId, objArr);
        } else {
            double d2 = ((NativeNumber) IdScriptableObject.ensureType(scriptable2, NativeNumber.class, idFunctionObject)).doubleValue;
            switch (methodId) {
                case 2:
                case 3:
                    if (objArr.length != 0 && !Undefined.isUndefined(objArr[0])) {
                        i = ScriptRuntime.toInt32(objArr[0]);
                    } else {
                        i = 10;
                    }
                    return ScriptRuntime.numberToString(d2, i);
                case 4:
                    return hl5.n("(new Number(", ScriptRuntime.toString(d2), "))");
                case 5:
                    return ScriptRuntime.wrapNumber(d2);
                case 6:
                    return js_toFixed(context, d2, objArr);
                case 7:
                    return js_toExponential(d2, objArr);
                case 8:
                    return js_toPrecision(d2, objArr);
                default:
                    vs.m(String.valueOf(methodId));
                    return null;
            }
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.defineProperty("NaN", ScriptRuntime.NaNobj, 7);
        idFunctionObject.defineProperty("POSITIVE_INFINITY", ScriptRuntime.wrapNumber(Double.POSITIVE_INFINITY), 7);
        idFunctionObject.defineProperty("NEGATIVE_INFINITY", ScriptRuntime.wrapNumber(Double.NEGATIVE_INFINITY), 7);
        idFunctionObject.defineProperty("MAX_VALUE", ScriptRuntime.wrapNumber(Double.MAX_VALUE), 7);
        idFunctionObject.defineProperty("MIN_VALUE", ScriptRuntime.wrapNumber(Double.MIN_VALUE), 7);
        idFunctionObject.defineProperty("MAX_SAFE_INTEGER", ScriptRuntime.wrapNumber(9.007199254740991E15d), 7);
        idFunctionObject.defineProperty("MIN_SAFE_INTEGER", ScriptRuntime.wrapNumber(MIN_SAFE_INTEGER), 7);
        idFunctionObject.defineProperty("EPSILON", ScriptRuntime.wrapNumber(EPSILON), 7);
        Object obj = NUMBER_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "isFinite", 1);
        addIdFunctionProperty(idFunctionObject, obj, -2, "isNaN", 1);
        addIdFunctionProperty(idFunctionObject, obj, -3, "isInteger", 1);
        addIdFunctionProperty(idFunctionObject, obj, -4, "isSafeInteger", 1);
        Object topLevelProp = ScriptRuntime.getTopLevelProp(idFunctionObject, "parseFloat");
        if (topLevelProp instanceof IdFunctionObject) {
            ((IdFunctionObject) topLevelProp).addAsProperty(idFunctionObject);
        }
        Object topLevelProp2 = ScriptRuntime.getTopLevelProp(idFunctionObject, "parseInt");
        if (topLevelProp2 instanceof IdFunctionObject) {
            ((IdFunctionObject) topLevelProp2).addAsProperty(idFunctionObject);
        }
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2020003546:
                if (str.equals("toLocaleString")) {
                    c = 0;
                    break;
                }
                break;
            case -1998299069:
                if (str.equals("toPrecision")) {
                    c = 1;
                    break;
                }
                break;
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 2;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 3;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 4;
                    break;
                }
                break;
            case -1178026567:
                if (str.equals("toFixed")) {
                    c = 5;
                    break;
                }
                break;
            case 231605032:
                if (str.equals("valueOf")) {
                    c = 6;
                    break;
                }
                break;
            case 1670723530:
                if (str.equals("toExponential")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 8;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
                return 6;
            case 6:
                return 5;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Number";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                str = "toString";
                break;
            case 3:
                str = "toLocaleString";
                break;
            case 4:
                str2 = "toSource";
                String str3 = str2;
                i2 = 0;
                str = str3;
                break;
            case 5:
                str2 = "valueOf";
                String str32 = str2;
                i2 = 0;
                str = str32;
                break;
            case 6:
                str = "toFixed";
                break;
            case 7:
                str = "toExponential";
                break;
            case 8:
                str = "toPrecision";
                break;
            default:
                vs.m(String.valueOf(i));
                return;
        }
        initPrototypeMethod(NUMBER_TAG, i, str, i2);
    }

    public String toString() {
        return ScriptRuntime.numberToString(this.doubleValue, 10);
    }

    private static boolean isDoubleInteger(double d) {
        return Double.isFinite(d) && Math.floor(d) == d;
    }

    private static boolean isDoubleSafeInteger(double d) {
        return isDoubleInteger(d) && d <= 9.007199254740991E15d && d >= MIN_SAFE_INTEGER;
    }
}
