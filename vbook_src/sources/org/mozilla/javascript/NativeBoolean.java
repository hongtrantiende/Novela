package org.mozilla.javascript;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeBoolean extends IdScriptableObject {
    private static final Object BOOLEAN_TAG = "Boolean";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final long serialVersionUID = -3716996899943880933L;
    private boolean booleanValue;

    public NativeBoolean(boolean z) {
        this.booleanValue = z;
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeBoolean(false).exportAsJSClass(4, scriptable, z);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(BOOLEAN_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            boolean z = false;
            if (objArr.length != 0) {
                Object obj = objArr[0];
                if (!(obj instanceof ScriptableObject) || !((ScriptableObject) obj).avoidObjectDetection()) {
                    z = ScriptRuntime.toBoolean(objArr[0]);
                }
            }
            if (scriptable2 == null) {
                return new NativeBoolean(z);
            }
            return ScriptRuntime.wrapBoolean(z);
        }
        boolean z2 = ((NativeBoolean) IdScriptableObject.ensureType(scriptable2, NativeBoolean.class, idFunctionObject)).booleanValue;
        if (methodId != 2) {
            if (methodId != 3) {
                if (methodId == 4) {
                    return ScriptRuntime.wrapBoolean(z2);
                }
                vs.m(String.valueOf(methodId));
                return null;
            } else if (z2) {
                return "(new Boolean(true))";
            } else {
                return "(new Boolean(false))";
            }
        } else if (z2) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 0;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 1;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 2;
                    break;
                }
                break;
            case 231605032:
                if (str.equals("valueOf")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Boolean";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == ScriptRuntime.BooleanClass) {
            return ScriptRuntime.wrapBoolean(this.booleanValue);
        }
        return super.getDefaultValue(cls);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        int i2;
        String str;
        if (i != 1) {
            i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "valueOf";
                    } else {
                        vs.m(String.valueOf(i));
                        return;
                    }
                } else {
                    str = "toSource";
                }
            } else {
                str = "toString";
            }
        } else {
            i2 = 1;
            str = "constructor";
        }
        initPrototypeMethod(BOOLEAN_TAG, i, str, i2);
    }
}
