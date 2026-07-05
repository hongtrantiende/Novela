package org.mozilla.javascript.regexp;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.Undefined;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class NativeRegExpCtor extends BaseFunction {
    private static final int DOLLAR_ID_BASE = 12;
    private static final int Id_AMPERSAND = 6;
    private static final int Id_BACK_QUOTE = 10;
    private static final int Id_DOLLAR_1 = 13;
    private static final int Id_DOLLAR_2 = 14;
    private static final int Id_DOLLAR_3 = 15;
    private static final int Id_DOLLAR_4 = 16;
    private static final int Id_DOLLAR_5 = 17;
    private static final int Id_DOLLAR_6 = 18;
    private static final int Id_DOLLAR_7 = 19;
    private static final int Id_DOLLAR_8 = 20;
    private static final int Id_DOLLAR_9 = 21;
    private static final int Id_PLUS = 8;
    private static final int Id_QUOTE = 12;
    private static final int Id_STAR = 2;
    private static final int Id_UNDERSCORE = 4;
    private static final int Id_input = 3;
    private static final int Id_lastMatch = 5;
    private static final int Id_lastParen = 7;
    private static final int Id_leftContext = 9;
    private static final int Id_multiline = 1;
    private static final int Id_rightContext = 11;
    private static final int MAX_INSTANCE_ID = 21;
    private static final long serialVersionUID = -5733330028285400526L;
    private int multilineAttr = 4;
    private int starAttr = 4;
    private int inputAttr = 4;
    private int underscoreAttr = 4;

    private static RegExpImpl getImpl() {
        return (RegExpImpl) ScriptRuntime.getRegExpProxy(Context.getCurrentContext());
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof NativeRegExp) && (objArr.length == 1 || objArr[1] == Undefined.instance)) {
                return obj;
            }
        }
        return construct(context, scriptable, objArr);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        NativeRegExp withLanguageVersion = NativeRegExpInstantiator.withLanguageVersion(context.getLanguageVersion());
        withLanguageVersion.compile(context, scriptable, objArr);
        ScriptRuntime.setBuiltinProtoAndParent(withLanguageVersion, scriptable, TopLevel.Builtins.RegExp);
        return withLanguageVersion;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        int i;
        int i2;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1304775693:
                if (str.equals("rightContext")) {
                    c = 0;
                    break;
                }
                break;
            case -1206239059:
                if (str.equals("multiline")) {
                    c = 1;
                    break;
                }
                break;
            case -223254616:
                if (str.equals("leftContext")) {
                    c = 2;
                    break;
                }
                break;
            case 1154:
                if (str.equals("$&")) {
                    c = 3;
                    break;
                }
                break;
            case 1155:
                if (str.equals("$'")) {
                    c = 4;
                    break;
                }
                break;
            case 1158:
                if (str.equals("$*")) {
                    c = 5;
                    break;
                }
                break;
            case 1159:
                if (str.equals("$+")) {
                    c = 6;
                    break;
                }
                break;
            case 1165:
                if (str.equals("$1")) {
                    c = 7;
                    break;
                }
                break;
            case 1166:
                if (str.equals("$2")) {
                    c = '\b';
                    break;
                }
                break;
            case 1167:
                if (str.equals("$3")) {
                    c = '\t';
                    break;
                }
                break;
            case 1168:
                if (str.equals("$4")) {
                    c = '\n';
                    break;
                }
                break;
            case 1169:
                if (str.equals("$5")) {
                    c = 11;
                    break;
                }
                break;
            case 1170:
                if (str.equals("$6")) {
                    c = '\f';
                    break;
                }
                break;
            case 1171:
                if (str.equals("$7")) {
                    c = '\r';
                    break;
                }
                break;
            case 1172:
                if (str.equals("$8")) {
                    c = 14;
                    break;
                }
                break;
            case 1173:
                if (str.equals("$9")) {
                    c = 15;
                    break;
                }
                break;
            case 1211:
                if (str.equals("$_")) {
                    c = 16;
                    break;
                }
                break;
            case 1212:
                if (str.equals("$`")) {
                    c = 17;
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c = 18;
                    break;
                }
                break;
            case 1996129487:
                if (str.equals("lastMatch")) {
                    c = 19;
                    break;
                }
                break;
            case 1998898196:
                if (str.equals("lastParen")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 11;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 9;
                break;
            case 3:
                i = 6;
                break;
            case 4:
                i = 12;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 13;
                break;
            case '\b':
                i = 14;
                break;
            case '\t':
                i = 15;
                break;
            case '\n':
                i = 16;
                break;
            case 11:
                i = 17;
                break;
            case '\f':
                i = 18;
                break;
            case '\r':
                i = 19;
                break;
            case 14:
                i = 20;
                break;
            case 15:
                i = 21;
                break;
            case 16:
                i = 4;
                break;
            case 17:
                i = 10;
                break;
            case 18:
                i = 3;
                break;
            case 19:
                i = 5;
                break;
            case 20:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i2 = 5;
                    } else {
                        i2 = this.underscoreAttr;
                    }
                } else {
                    i2 = this.inputAttr;
                }
            } else {
                i2 = this.starAttr;
            }
        } else {
            i2 = this.multilineAttr;
        }
        return IdScriptableObject.instanceIdInfo(i2, super.getMaxInstanceId() + i);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return 2;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        return "RegExp";
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        int maxInstanceId = i - super.getMaxInstanceId();
        if (1 <= maxInstanceId && maxInstanceId <= 21) {
            switch (maxInstanceId) {
                case 1:
                    return "multiline";
                case 2:
                    return "$*";
                case 3:
                    return "input";
                case 4:
                    return "$_";
                case 5:
                    return "lastMatch";
                case 6:
                    return "$&";
                case 7:
                    return "lastParen";
                case 8:
                    return "$+";
                case 9:
                    return "leftContext";
                case 10:
                    return "$`";
                case 11:
                    return "rightContext";
                case 12:
                    return "$'";
                default:
                    return new String(new char[]{'$', (char) (maxInstanceId + 36)});
            }
        }
        return super.getInstanceIdName(i);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        Object obj;
        int maxInstanceId = i - super.getMaxInstanceId();
        if (1 <= maxInstanceId && maxInstanceId <= 21) {
            RegExpImpl impl = getImpl();
            switch (maxInstanceId) {
                case 1:
                case 2:
                    return ScriptRuntime.wrapBoolean(impl.multiline);
                case 3:
                case 4:
                    obj = impl.input;
                    break;
                case 5:
                case 6:
                    obj = impl.lastMatch;
                    break;
                case 7:
                case 8:
                    obj = impl.lastParen;
                    break;
                case 9:
                case 10:
                    obj = impl.leftContext;
                    break;
                case 11:
                case 12:
                    obj = impl.rightContext;
                    break;
                default:
                    obj = impl.getParenSubString(maxInstanceId - 13);
                    break;
            }
            if (obj == null) {
                return "";
            }
            return obj.toString();
        }
        return super.getInstanceIdValue(i);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return 2;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return super.getMaxInstanceId() + 21;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdAttributes(int i, int i2) {
        int maxInstanceId = i - super.getMaxInstanceId();
        switch (maxInstanceId) {
            case 1:
                this.multilineAttr = i2;
                return;
            case 2:
                this.starAttr = i2;
                return;
            case 3:
                this.inputAttr = i2;
                return;
            case 4:
                this.underscoreAttr = i2;
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            default:
                int i3 = maxInstanceId - 13;
                if (i3 < 0 || i3 > 8) {
                    super.setInstanceIdAttributes(i, i2);
                    return;
                }
                return;
        }
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i, Object obj) {
        int maxInstanceId = i - super.getMaxInstanceId();
        switch (maxInstanceId) {
            case 1:
            case 2:
                getImpl().multiline = ScriptRuntime.toBoolean(obj);
                return;
            case 3:
            case 4:
                getImpl().input = ScriptRuntime.toString(obj);
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            default:
                int i2 = maxInstanceId - 13;
                if (i2 < 0 || i2 > 8) {
                    super.setInstanceIdValue(i, obj);
                    return;
                }
                return;
        }
    }
}
