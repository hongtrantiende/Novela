package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeBigInt extends IdScriptableObject {
    private static final Object BIG_INT_TAG = "BigInt";
    private static final int ConstructorId_asIntN = -1;
    private static final int ConstructorId_asUintN = -2;
    private static final int Id_constructor = 1;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final int SymbolId_toStringTag = 6;
    private static final long serialVersionUID = 1335609231306775449L;
    private BigInteger bigIntValue;

    public NativeBigInt(BigInteger bigInteger) {
        this.bigIntValue = bigInteger;
    }

    private static Object execConstructorCall(int i, Object[] objArr) {
        Object obj;
        Object obj2;
        byte b = -1;
        if (i != -2 && i != -1) {
            vs.m(String.valueOf(i));
            return null;
        }
        if (objArr.length < 1) {
            obj = Undefined.instance;
        } else {
            obj = objArr[0];
        }
        int index = ScriptRuntime.toIndex(obj);
        if (objArr.length < 2) {
            obj2 = Undefined.instance;
        } else {
            obj2 = objArr[1];
        }
        BigInteger bigInt = ScriptRuntime.toBigInt(obj2);
        if (index == 0) {
            return BigInteger.ZERO;
        }
        byte[] byteArray = bigInt.toByteArray();
        int i2 = (index / 8) + 1;
        if (i2 > byteArray.length) {
            return bigInt;
        }
        byte[] copyOfRange = Arrays.copyOfRange(byteArray, byteArray.length - i2, byteArray.length);
        int i3 = index % 8;
        if (i != -2) {
            if (i == -1) {
                if (i3 == 0) {
                    if (copyOfRange[1] >= 0) {
                        b = 0;
                    }
                    copyOfRange[0] = b;
                } else {
                    byte b2 = copyOfRange[0];
                    if (((1 << (i3 - 1)) & b2) != 0) {
                        copyOfRange[0] = (byte) (b2 | ((-1) << i3));
                    } else {
                        copyOfRange[0] = (byte) (b2 & ((1 << i3) - 1));
                    }
                }
            }
        } else {
            copyOfRange[0] = (byte) (copyOfRange[0] & ((1 << i3) - 1));
        }
        return new BigInteger(copyOfRange);
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeBigInt(BigInteger.ZERO).exportAsJSClass(6, scriptable, z);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i;
        Object obj;
        Object obj2 = BIG_INT_TAG;
        if (!idFunctionObject.hasTag(obj2)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            if (scriptable2 != null) {
                if (objArr.length >= 1) {
                    return ScriptRuntime.toBigInt(objArr[0]);
                }
                return BigInteger.ZERO;
            }
            throw ScriptRuntime.typeErrorById("msg.not.ctor", obj2);
        } else if (methodId < 1) {
            return execConstructorCall(methodId, objArr);
        } else {
            BigInteger bigInteger = ((NativeBigInt) IdScriptableObject.ensureType(scriptable2, NativeBigInt.class, idFunctionObject)).bigIntValue;
            if (methodId != 2 && methodId != 3) {
                if (methodId != 4) {
                    if (methodId == 5) {
                        return bigInteger;
                    }
                    vs.m(String.valueOf(methodId));
                    return null;
                }
                return hl5.n("(new BigInt(", ScriptRuntime.toString(bigInteger), "))");
            }
            if (objArr.length != 0 && (obj = objArr[0]) != Undefined.instance) {
                i = ScriptRuntime.toInt32(obj);
            } else {
                i = 10;
            }
            return ScriptRuntime.bigIntToString(bigInteger, i);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = BIG_INT_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "asIntN", 2);
        addIdFunctionProperty(idFunctionObject, obj, -2, "asUintN", 2);
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
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 1;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 2;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 3;
                    break;
                }
                break;
            case 231605032:
                if (str.equals("valueOf")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "BigInt";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        if (i == 6) {
            initPrototypeValue(6, SymbolKey.TO_STRING_TAG, getClassName(), 3);
            return;
        }
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str = "valueOf";
                        } else {
                            vs.m(String.valueOf(i));
                            return;
                        }
                    } else {
                        str = "toSource";
                    }
                } else {
                    str = "toLocaleString";
                }
            } else {
                str = "toString";
            }
            i2 = 0;
        } else {
            str = "constructor";
        }
        initPrototypeMethod(BIG_INT_TAG, i, str, i2);
    }

    public String toString() {
        return ScriptRuntime.bigIntToString(this.bigIntValue, 10);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.TO_STRING_TAG.equals(symbol) ? 6 : 0;
    }
}
