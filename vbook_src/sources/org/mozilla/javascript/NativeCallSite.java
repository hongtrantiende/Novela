package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeCallSite extends IdScriptableObject {
    private static final String CALLSITE_TAG = "CallSite";
    private static final int Id_constructor = 1;
    private static final int Id_getColumnNumber = 9;
    private static final int Id_getEvalOrigin = 10;
    private static final int Id_getFileName = 7;
    private static final int Id_getFunction = 4;
    private static final int Id_getFunctionName = 5;
    private static final int Id_getLineNumber = 8;
    private static final int Id_getMethodName = 6;
    private static final int Id_getThis = 2;
    private static final int Id_getTypeName = 3;
    private static final int Id_isConstructor = 14;
    private static final int Id_isEval = 12;
    private static final int Id_isNative = 13;
    private static final int Id_isToplevel = 11;
    private static final int Id_toString = 15;
    private static final int MAX_PROTOTYPE_ID = 15;
    private static final long serialVersionUID = 2688372752566593594L;
    private ScriptStackElement element;

    private NativeCallSite() {
    }

    private static Object getFileName(Scriptable scriptable) {
        while (scriptable != null && !(scriptable instanceof NativeCallSite)) {
            scriptable = scriptable.getPrototype();
        }
        if (scriptable == null) {
            return Scriptable.NOT_FOUND;
        }
        ScriptStackElement scriptStackElement = ((NativeCallSite) scriptable).element;
        if (scriptStackElement == null) {
            return null;
        }
        return scriptStackElement.fileName;
    }

    private static Object getFunctionName(Scriptable scriptable) {
        while (scriptable != null && !(scriptable instanceof NativeCallSite)) {
            scriptable = scriptable.getPrototype();
        }
        if (scriptable == null) {
            return Scriptable.NOT_FOUND;
        }
        ScriptStackElement scriptStackElement = ((NativeCallSite) scriptable).element;
        if (scriptStackElement == null) {
            return null;
        }
        return scriptStackElement.functionName;
    }

    private static Object getLineNumber(Scriptable scriptable) {
        int i;
        while (scriptable != null && !(scriptable instanceof NativeCallSite)) {
            scriptable = scriptable.getPrototype();
        }
        if (scriptable == null) {
            return Scriptable.NOT_FOUND;
        }
        ScriptStackElement scriptStackElement = ((NativeCallSite) scriptable).element;
        if (scriptStackElement != null && (i = scriptStackElement.lineNumber) >= 0) {
            return Integer.valueOf(i);
        }
        return Undefined.instance;
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeCallSite().exportAsJSClass(15, scriptable, z);
    }

    private static Object js_toString(Scriptable scriptable) {
        while (scriptable != null && !(scriptable instanceof NativeCallSite)) {
            scriptable = scriptable.getPrototype();
        }
        if (scriptable == null) {
            return Scriptable.NOT_FOUND;
        }
        StringBuilder sb = new StringBuilder();
        ((NativeCallSite) scriptable).element.renderJavaStyle(sb);
        return sb.toString();
    }

    public static NativeCallSite make(Scriptable scriptable, Scriptable scriptable2) {
        NativeCallSite nativeCallSite = new NativeCallSite();
        nativeCallSite.setParentScope(scriptable);
        nativeCallSite.setPrototype((Scriptable) scriptable2.get("prototype", scriptable2));
        return nativeCallSite;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(CALLSITE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        switch (methodId) {
            case 1:
                return make(scriptable, idFunctionObject);
            case 2:
            case 3:
            case 4:
            case 9:
                return Undefined.instance;
            case 5:
                return getFunctionName(scriptable2);
            case 6:
                return null;
            case 7:
                return getFileName(scriptable2);
            case 8:
                return getLineNumber(scriptable2);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return Boolean.FALSE;
            case 15:
                return js_toString(scriptable2);
            default:
                vs.m(String.valueOf(methodId));
                return null;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c = 0;
                    break;
                }
                break;
            case -1747710311:
                if (str.equals("isToplevel")) {
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
            case -1180529434:
                if (str.equals("isEval")) {
                    c = 3;
                    break;
                }
                break;
            case -1020911870:
                if (str.equals("getMethodName")) {
                    c = 4;
                    break;
                }
                break;
            case -836128434:
                if (str.equals("getFunction")) {
                    c = 5;
                    break;
                }
                break;
            case -626890669:
                if (str.equals("getLineNumber")) {
                    c = 6;
                    break;
                }
                break;
            case -511762728:
                if (str.equals("getEvalOrigin")) {
                    c = 7;
                    break;
                }
                break;
            case -378584607:
                if (str.equals("isNative")) {
                    c = '\b';
                    break;
                }
                break;
            case -75122924:
                if (str.equals("getThis")) {
                    c = '\t';
                    break;
                }
                break;
            case 1033688245:
                if (str.equals("getColumnNumber")) {
                    c = '\n';
                    break;
                }
                break;
            case 1296528496:
                if (str.equals("isConstructor")) {
                    c = 11;
                    break;
                }
                break;
            case 1342178205:
                if (str.equals("getFileName")) {
                    c = '\f';
                    break;
                }
                break;
            case 1401392731:
                if (str.equals("getTypeName")) {
                    c = '\r';
                    break;
                }
                break;
            case 1415137529:
                if (str.equals("getFunctionName")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 15;
            case 1:
                return 11;
            case 2:
                return 1;
            case 3:
                return 12;
            case 4:
                return 6;
            case 5:
                return 4;
            case 6:
                return 8;
            case 7:
                return 10;
            case '\b':
                return 13;
            case '\t':
                return 2;
            case '\n':
                return 9;
            case 11:
                return 14;
            case '\f':
                return 7;
            case '\r':
                return 3;
            case 14:
                return 5;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CALLSITE_TAG;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                str = "getThis";
                break;
            case 3:
                str = "getTypeName";
                break;
            case 4:
                str = "getFunction";
                break;
            case 5:
                str = "getFunctionName";
                break;
            case 6:
                str = "getMethodName";
                break;
            case 7:
                str = "getFileName";
                break;
            case 8:
                str = "getLineNumber";
                break;
            case 9:
                str = "getColumnNumber";
                break;
            case 10:
                str = "getEvalOrigin";
                break;
            case 11:
                str = "isToplevel";
                break;
            case 12:
                str = "isEval";
                break;
            case 13:
                str = "isNative";
                break;
            case 14:
                str = "isConstructor";
                break;
            case 15:
                str = "toString";
                break;
            default:
                vs.m(String.valueOf(i));
                return;
        }
        initPrototypeMethod(CALLSITE_TAG, i, str, 0);
    }

    public void setElement(ScriptStackElement scriptStackElement) {
        this.element = scriptStackElement;
    }

    public String toString() {
        ScriptStackElement scriptStackElement = this.element;
        if (scriptStackElement == null) {
            return "";
        }
        return scriptStackElement.toString();
    }
}
