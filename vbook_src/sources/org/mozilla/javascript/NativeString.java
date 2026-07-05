package org.mozilla.javascript;

import java.text.Collator;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Locale;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.TopLevel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeString extends IdScriptableObject {
    private static final int ConstructorId_charAt = -5;
    private static final int ConstructorId_charCodeAt = -6;
    private static final int ConstructorId_concat = -14;
    private static final int ConstructorId_equalsIgnoreCase = -30;
    private static final int ConstructorId_fromCharCode = -1;
    private static final int ConstructorId_fromCodePoint = -2;
    private static final int ConstructorId_indexOf = -7;
    private static final int ConstructorId_lastIndexOf = -8;
    private static final int ConstructorId_localeCompare = -35;
    private static final int ConstructorId_match = -31;
    private static final int ConstructorId_raw = -3;
    private static final int ConstructorId_replace = -33;
    private static final int ConstructorId_replaceAll = -34;
    private static final int ConstructorId_search = -32;
    private static final int ConstructorId_slice = -15;
    private static final int ConstructorId_split = -9;
    private static final int ConstructorId_substr = -13;
    private static final int ConstructorId_substring = -10;
    private static final int ConstructorId_toLocaleLowerCase = -36;
    private static final int ConstructorId_toLowerCase = -11;
    private static final int ConstructorId_toUpperCase = -12;
    private static final int Id_anchor = 28;
    private static final int Id_at = 52;
    private static final int Id_big = 21;
    private static final int Id_blink = 22;
    private static final int Id_bold = 16;
    private static final int Id_charAt = 5;
    private static final int Id_charCodeAt = 6;
    private static final int Id_codePointAt = 46;
    private static final int Id_concat = 14;
    private static final int Id_constructor = 1;
    private static final int Id_endsWith = 43;
    private static final int Id_equals = 29;
    private static final int Id_equalsIgnoreCase = 30;
    private static final int Id_fixed = 18;
    private static final int Id_fontcolor = 26;
    private static final int Id_fontsize = 25;
    private static final int Id_includes = 41;
    private static final int Id_indexOf = 7;
    private static final int Id_isWellFormed = 53;
    private static final int Id_italics = 17;
    private static final int Id_lastIndexOf = 8;
    private static final int Id_length = 1;
    private static final int Id_link = 27;
    private static final int Id_localeCompare = 35;
    private static final int Id_match = 31;
    private static final int Id_matchAll = 55;
    private static final int Id_normalize = 44;
    private static final int Id_padEnd = 48;
    private static final int Id_padStart = 47;
    private static final int Id_repeat = 45;
    private static final int Id_replace = 33;
    private static final int Id_replaceAll = 34;
    private static final int Id_search = 32;
    private static final int Id_slice = 15;
    private static final int Id_small = 20;
    private static final int Id_split = 9;
    private static final int Id_startsWith = 42;
    private static final int Id_strike = 19;
    private static final int Id_sub = 24;
    private static final int Id_substr = 13;
    private static final int Id_substring = 10;
    private static final int Id_sup = 23;
    private static final int Id_toLocaleLowerCase = 36;
    private static final int Id_toLocaleUpperCase = 37;
    private static final int Id_toLowerCase = 11;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_toUpperCase = 12;
    private static final int Id_toWellFormed = 54;
    private static final int Id_trim = 38;
    private static final int Id_trimEnd = 51;
    private static final int Id_trimLeft = 39;
    private static final int Id_trimRight = 40;
    private static final int Id_trimStart = 50;
    private static final int Id_valueOf = 4;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 55;
    private static final Object STRING_TAG = "String";
    private static final int SymbolId_iterator = 49;
    private static final long serialVersionUID = 920268368584188687L;
    private CharSequence string;

    public NativeString(CharSequence charSequence) {
        this.string = charSequence;
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object obj) {
        Scriptable parentScope = getParentScope();
        if (parentScope != null) {
            this = parentScope;
        }
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, this, TopLevel.Builtins.Object);
        nativeObject.defineProperty(ES6Iterator.VALUE_PROPERTY, obj, 0);
        Boolean bool = Boolean.FALSE;
        nativeObject.defineProperty("writable", bool, 0);
        nativeObject.defineProperty("enumerable", Boolean.TRUE, 0);
        nativeObject.defineProperty("configurable", bool, 0);
        return nativeObject;
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeString("").exportAsJSClass(55, scriptable, z);
    }

    private static String js_concat(String str, Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.concat(ScriptRuntime.toString(objArr[0]));
        }
        int length2 = str.length();
        String[] strArr = new String[length];
        for (int i = 0; i != length; i++) {
            String scriptRuntime = ScriptRuntime.toString(objArr[i]);
            strArr[i] = scriptRuntime;
            length2 += scriptRuntime.length();
        }
        StringBuilder sb = new StringBuilder(length2);
        sb.append(str);
        for (int i2 = 0; i2 != length; i2++) {
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    private static int js_indexOf(int i, String str, Object[] objArr) {
        int length;
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        double integer = ScriptRuntime.toInteger(objArr, 1);
        if (i != 42 && i != 43 && scriptRuntime.length() == 0) {
            if (integer > str.length()) {
                return str.length();
            }
            return (int) integer;
        } else if (i != 42 && i != 43 && integer > str.length()) {
            return -1;
        } else {
            if (integer < 0.0d) {
                integer = 0.0d;
            } else {
                if (integer > str.length()) {
                    length = str.length();
                } else if (i == 43 && (Double.isNaN(integer) || integer > str.length())) {
                    length = str.length();
                }
                integer = length;
            }
            if (43 == i) {
                if (objArr.length == 0 || objArr.length == 1 || (objArr.length == 2 && objArr[1] == Undefined.instance)) {
                    integer = str.length();
                }
                if (str.substring(0, (int) integer).endsWith(scriptRuntime)) {
                    return 0;
                }
                return -1;
            } else if (i == 42) {
                if (str.startsWith(scriptRuntime, (int) integer)) {
                    return 0;
                }
                return -1;
            } else {
                return str.indexOf(scriptRuntime, (int) integer);
            }
        }
    }

    private static int js_lastIndexOf(String str, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        double number = ScriptRuntime.toNumber(objArr, 1);
        if (!Double.isNaN(number) && number <= str.length()) {
            if (number < 0.0d) {
                number = 0.0d;
            }
        } else {
            number = str.length();
        }
        return str.lastIndexOf(scriptRuntime, (int) number);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r7.length() < 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String js_pad(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, org.mozilla.javascript.IdFunctionObject r6, java.lang.Object[] r7, boolean r8) {
        /*
            java.lang.Object r4 = org.mozilla.javascript.ScriptRuntimeES6.requireObjectCoercible(r4, r5, r6)
            java.lang.String r4 = org.mozilla.javascript.ScriptRuntime.toString(r4)
            r5 = 0
            long r0 = org.mozilla.javascript.ScriptRuntime.toLength(r7, r5)
            int r6 = r4.length()
            long r2 = (long) r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L17
            goto L30
        L17:
            int r6 = r7.length
            r2 = 2
            if (r6 < r2) goto L31
            r6 = 1
            r2 = r7[r6]
            boolean r2 = org.mozilla.javascript.Undefined.isUndefined(r2)
            if (r2 != 0) goto L31
            r7 = r7[r6]
            java.lang.String r7 = org.mozilla.javascript.ScriptRuntime.toString(r7)
            int r2 = r7.length()
            if (r2 >= r6) goto L33
        L30:
            return r4
        L31:
            java.lang.String r7 = " "
        L33:
            int r6 = r4.length()
            long r2 = (long) r6
            long r0 = r0 - r2
            int r6 = (int) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L3f:
            r0.append(r7)
            int r1 = r0.length()
            if (r1 < r6) goto L3f
            r0.setLength(r6)
            if (r8 == 0) goto L55
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L55:
            java.lang.StringBuilder r4 = r0.insert(r5, r4)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.js_pad(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.IdFunctionObject, java.lang.Object[], boolean):java.lang.String");
    }

    private static CharSequence js_raw(Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        int i = 0;
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        Scriptable object = ScriptRuntime.toObject(context, scriptable, ScriptRuntime.getObjectProp(ScriptRuntime.toObject(context, scriptable, obj), "raw", context));
        long lengthProperty = NativeArray.getLengthProperty(context, object);
        if (lengthProperty <= 2147483647L) {
            int i2 = (int) lengthProperty;
            if (i2 <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(ScriptRuntime.toString(ScriptRuntime.getObjectIndex(object, i, context)));
                i++;
                if (i == i2) {
                    return sb;
                }
                if (objArr.length > i) {
                    sb.append(ScriptRuntime.toString(objArr[i]));
                }
            }
        } else {
            throw ScriptRuntime.rangeError("raw.length > 2147483647");
        }
    }

    private static String js_repeat(Context context, Scriptable scriptable, IdFunctionObject idFunctionObject, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable, idFunctionObject));
        double integer = ScriptRuntime.toInteger(objArr, 0);
        if (integer >= 0.0d && integer != Double.POSITIVE_INFINITY) {
            if (integer != 0.0d && scriptRuntime.length() != 0) {
                long length = scriptRuntime.length() * ((long) integer);
                if (integer <= 2.147483647E9d && length <= 2147483647L) {
                    StringBuilder sb = new StringBuilder((int) length);
                    sb.append(scriptRuntime);
                    int i = (int) integer;
                    int i2 = 1;
                    while (i2 <= i / 2) {
                        sb.append((CharSequence) sb);
                        i2 *= 2;
                    }
                    if (i2 < i) {
                        sb.append(sb.substring(0, (i - i2) * scriptRuntime.length()));
                    }
                    return sb.toString();
                }
                throw ScriptRuntime.rangeError("Invalid size or count value");
            }
            return "";
        }
        throw ScriptRuntime.rangeError("Invalid count value");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r6 < 0.0d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r6 > r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (r1 >= r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r1 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.CharSequence js_slice(java.lang.CharSequence r10, java.lang.Object[] r11) {
        /*
            int r0 = r11.length
            r1 = 0
            r3 = 1
            if (r0 >= r3) goto L8
            r4 = r1
            goto Lf
        L8:
            r0 = 0
            r0 = r11[r0]
            double r4 = org.mozilla.javascript.ScriptRuntime.toInteger(r0)
        Lf:
            int r0 = r10.length()
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L1f
            double r6 = (double) r0
            double r4 = r4 + r6
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L25
            r4 = r1
            goto L25
        L1f:
            double r6 = (double) r0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L25
            r4 = r6
        L25:
            int r6 = r11.length
            r7 = 2
            if (r6 < r7) goto L4c
            r11 = r11[r3]
            java.lang.Object r3 = org.mozilla.javascript.Undefined.instance
            if (r11 != r3) goto L30
            goto L4c
        L30:
            double r6 = org.mozilla.javascript.ScriptRuntime.toInteger(r11)
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 >= 0) goto L41
            double r8 = (double) r0
            double r6 = r6 + r8
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 >= 0) goto L3f
            goto L46
        L3f:
            r1 = r6
            goto L46
        L41:
            double r1 = (double) r0
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 <= 0) goto L3f
        L46:
            int r11 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r11 >= 0) goto L4d
            r1 = r4
            goto L4d
        L4c:
            double r1 = (double) r0
        L4d:
            int r11 = (int) r4
            int r0 = (int) r1
            java.lang.CharSequence r10 = r10.subSequence(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.js_slice(java.lang.CharSequence, java.lang.Object[]):java.lang.CharSequence");
    }

    private static CharSequence js_substr(CharSequence charSequence, Object[] objArr) {
        if (objArr.length < 1) {
            return charSequence;
        }
        double integer = ScriptRuntime.toInteger(objArr[0]);
        int length = charSequence.length();
        double d = 0.0d;
        if (integer < 0.0d) {
            integer += length;
            if (integer < 0.0d) {
                integer = 0.0d;
            }
        } else {
            double d2 = length;
            if (integer > d2) {
                integer = d2;
            }
        }
        double d3 = length;
        if (objArr.length > 1) {
            Object obj = objArr[1];
            if (!Undefined.isUndefined(obj)) {
                double integer2 = ScriptRuntime.toInteger(obj);
                if (integer2 >= 0.0d) {
                    d = integer2;
                }
                double d4 = d + integer;
                if (d4 <= d3) {
                    d3 = d4;
                }
            }
        }
        return charSequence.subSequence((int) integer, (int) d3);
    }

    private static CharSequence js_substring(Context context, CharSequence charSequence, Object[] objArr) {
        Object obj;
        int length = charSequence.length();
        double integer = ScriptRuntime.toInteger(objArr, 0);
        double d = 0.0d;
        if (integer < 0.0d) {
            integer = 0.0d;
        } else {
            double d2 = length;
            if (integer > d2) {
                integer = d2;
            }
        }
        if (objArr.length > 1 && (obj = objArr[1]) != Undefined.instance) {
            double integer2 = ScriptRuntime.toInteger(obj);
            if (integer2 >= 0.0d) {
                d = length;
                if (integer2 <= d) {
                    d = integer2;
                }
            }
            if (d < integer) {
                if (context.getLanguageVersion() != 120) {
                    double d3 = d;
                    d = integer;
                    integer = d3;
                } else {
                    d = integer;
                }
            }
        } else {
            d = length;
        }
        return charSequence.subSequence((int) integer, (int) d);
    }

    private static NativeString realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return (NativeString) IdScriptableObject.ensureType(scriptable, NativeString.class, idFunctionObject);
    }

    private static String tagify(Context context, Scriptable scriptable, IdFunctionObject idFunctionObject, String str, String str2, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable, idFunctionObject));
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        if (str2 != null && str2.length() > 0) {
            String replace = ScriptRuntime.toString(objArr, 0).replace("\"", "&quot;");
            sb.append(' ');
            sb.append(str2);
            sb.append("=\"");
            sb.append(replace);
            sb.append('\"');
        }
        sb.append('>');
        sb.append(scriptRuntime);
        sb.append("</");
        sb.append(str);
        sb.append('>');
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.CharSequence] */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable object;
        boolean equalsIgnoreCase;
        int i;
        RegExpProxy regExpProxy;
        Object obj;
        Object obj2;
        if (!idFunctionObject.hasTag(STRING_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        Scriptable scriptable3 = scriptable2;
        Object[] objArr2 = objArr;
        for (int methodId = idFunctionObject.methodId(); methodId != -3; methodId = -methodId) {
            String str = "";
            int i2 = 1;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            int i3 = 0;
            if (methodId != -2) {
                if (methodId != -1) {
                    switch (methodId) {
                        case ConstructorId_toLocaleLowerCase /* -36 */:
                        case ConstructorId_localeCompare /* -35 */:
                        case ConstructorId_replaceAll /* -34 */:
                        case ConstructorId_replace /* -33 */:
                        case ConstructorId_search /* -32 */:
                        case ConstructorId_match /* -31 */:
                        case ConstructorId_equalsIgnoreCase /* -30 */:
                            break;
                        default:
                            switch (methodId) {
                                case -15:
                                case -14:
                                case -13:
                                case -12:
                                case -11:
                                case -10:
                                case -9:
                                case -8:
                                case -7:
                                case -6:
                                case -5:
                                    break;
                                default:
                                    switch (methodId) {
                                        case 1:
                                            String str2 = str;
                                            if (objArr2.length != 0) {
                                                if (ScriptRuntime.isSymbol(objArr2[0]) && scriptable3 != null) {
                                                    str2 = objArr2[0].toString();
                                                } else {
                                                    str2 = ScriptRuntime.toCharSequence(objArr2[0]);
                                                }
                                            }
                                            if (scriptable3 == null) {
                                                return new NativeString(str2);
                                            }
                                            if (str2 instanceof String) {
                                                return str2;
                                            }
                                            return str2.toString();
                                        case 2:
                                        case 4:
                                            CharSequence charSequence = realThis(scriptable3, idFunctionObject).string;
                                            if (charSequence instanceof String) {
                                                return charSequence;
                                            }
                                            return charSequence.toString();
                                        case 3:
                                            return hl5.n("(new String(\"", ScriptRuntime.escapeString(realThis(scriptable3, idFunctionObject).string.toString()), "\"))");
                                        case 5:
                                        case 6:
                                            CharSequence charSequence2 = ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            double integer = ScriptRuntime.toInteger(objArr2, 0);
                                            if (integer >= 0.0d && integer < charSequence2.length()) {
                                                char charAt = charSequence2.charAt((int) integer);
                                                if (methodId == 5) {
                                                    return String.valueOf(charAt);
                                                }
                                                return ScriptRuntime.wrapInt(charAt);
                                            } else if (methodId == 5) {
                                                return "";
                                            } else {
                                                return ScriptRuntime.NaNobj;
                                            }
                                        case 7:
                                            return ScriptRuntime.wrapInt(js_indexOf(7, ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2));
                                        case 8:
                                            return ScriptRuntime.wrapInt(js_lastIndexOf(ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2));
                                        case 9:
                                            return ScriptRuntime.checkRegExpProxy(context).js_split(context, scriptable, ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2);
                                        case 10:
                                            return js_substring(context, ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2);
                                        case 11:
                                            return ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)).toLowerCase(Locale.ROOT);
                                        case 12:
                                            return ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)).toUpperCase(Locale.ROOT);
                                        case 13:
                                            return js_substr(ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2);
                                        case 14:
                                            return js_concat(ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2);
                                        case 15:
                                            return js_slice(ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), objArr2);
                                        case 16:
                                            return tagify(context, scriptable3, idFunctionObject, "b", null, null);
                                        case 17:
                                            return tagify(context, scriptable3, idFunctionObject, "i", null, null);
                                        case 18:
                                            return tagify(context, scriptable3, idFunctionObject, "tt", null, null);
                                        case 19:
                                            return tagify(context, scriptable3, idFunctionObject, "strike", null, null);
                                        case 20:
                                            return tagify(context, scriptable3, idFunctionObject, "small", null, null);
                                        case 21:
                                            return tagify(context, scriptable3, idFunctionObject, "big", null, null);
                                        case 22:
                                            return tagify(context, scriptable3, idFunctionObject, "blink", null, null);
                                        case 23:
                                            return tagify(context, scriptable3, idFunctionObject, "sup", null, null);
                                        case 24:
                                            return tagify(context, scriptable3, idFunctionObject, "sub", null, null);
                                        case 25:
                                            return tagify(context, scriptable3, idFunctionObject, "font", "size", objArr2);
                                        case 26:
                                            return tagify(context, scriptable3, idFunctionObject, "font", "color", objArr2);
                                        case 27:
                                            return tagify(context, scriptable3, idFunctionObject, "a", "href", objArr2);
                                        case 28:
                                            return tagify(context, scriptable3, idFunctionObject, "a", "name", objArr2);
                                        case 29:
                                        case 30:
                                            String scriptRuntime = ScriptRuntime.toString(scriptable3);
                                            String scriptRuntime2 = ScriptRuntime.toString(objArr2, 0);
                                            if (methodId == 29) {
                                                equalsIgnoreCase = scriptRuntime.equals(scriptRuntime2);
                                            } else {
                                                equalsIgnoreCase = scriptRuntime.equalsIgnoreCase(scriptRuntime2);
                                            }
                                            return ScriptRuntime.wrapBoolean(equalsIgnoreCase);
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                            if (methodId != 31) {
                                                if (methodId == 32) {
                                                    i2 = 4;
                                                } else if (methodId == 33) {
                                                    i2 = 2;
                                                } else {
                                                    i = 3;
                                                    ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject);
                                                    return ScriptRuntime.checkRegExpProxy(context).action(context, scriptable, scriptable3, objArr2, i);
                                                }
                                            }
                                            i = i2;
                                            ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject);
                                            return ScriptRuntime.checkRegExpProxy(context).action(context, scriptable, scriptable3, objArr2, i);
                                        case 35:
                                            String scriptRuntime3 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            Collator collator = Collator.getInstance(context.getLocale());
                                            collator.setStrength(3);
                                            collator.setDecomposition(1);
                                            return ScriptRuntime.wrapNumber(collator.compare(scriptRuntime3, ScriptRuntime.toString(objArr2, 0)));
                                        case 36:
                                            String scriptRuntime4 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            Locale locale = context.getLocale();
                                            if (objArr2.length > 0 && context.hasFeature(22)) {
                                                locale = new Locale(ScriptRuntime.toString(objArr2[0]));
                                            }
                                            return scriptRuntime4.toLowerCase(locale);
                                        case 37:
                                            String scriptRuntime5 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            Locale locale2 = context.getLocale();
                                            if (objArr2.length > 0 && context.hasFeature(22)) {
                                                locale2 = new Locale(ScriptRuntime.toString(objArr2[0]));
                                            }
                                            return scriptRuntime5.toUpperCase(locale2);
                                        case 38:
                                            String scriptRuntime6 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            char[] charArray = scriptRuntime6.toCharArray();
                                            while (i3 < charArray.length && ScriptRuntime.isJSWhitespaceOrLineTerminator(charArray[i3])) {
                                                i3++;
                                            }
                                            int length = charArray.length;
                                            while (length > i3 && ScriptRuntime.isJSWhitespaceOrLineTerminator(charArray[length - 1])) {
                                                length--;
                                            }
                                            return scriptRuntime6.substring(i3, length);
                                        case 39:
                                        case 50:
                                            String scriptRuntime7 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            char[] charArray2 = scriptRuntime7.toCharArray();
                                            while (i3 < charArray2.length && ScriptRuntime.isJSWhitespaceOrLineTerminator(charArray2[i3])) {
                                                i3++;
                                            }
                                            return scriptRuntime7.substring(i3, charArray2.length);
                                        case 40:
                                        case 51:
                                            String scriptRuntime8 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            char[] charArray3 = scriptRuntime8.toCharArray();
                                            int length2 = charArray3.length;
                                            while (length2 > 0 && ScriptRuntime.isJSWhitespaceOrLineTerminator(charArray3[length2 - 1])) {
                                                length2--;
                                            }
                                            return scriptRuntime8.substring(0, length2);
                                        case 41:
                                        case 42:
                                        case 43:
                                            String scriptRuntime9 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            if (objArr2.length > 0 && (regExpProxy = ScriptRuntime.getRegExpProxy(context)) != null) {
                                                Object obj3 = objArr2[0];
                                                if (obj3 instanceof Scriptable) {
                                                    Scriptable scriptable4 = (Scriptable) obj3;
                                                    if (regExpProxy.isRegExp(scriptable4) && ScriptableObject.isTrue(ScriptableObject.getProperty(scriptable4, SymbolKey.MATCH))) {
                                                        throw ScriptRuntime.typeErrorById("msg.first.arg.not.regexp", "String", idFunctionObject.getFunctionName());
                                                    }
                                                }
                                            }
                                            int js_indexOf = js_indexOf(methodId, scriptRuntime9, objArr2);
                                            if (methodId == 41) {
                                                if (js_indexOf == -1) {
                                                    z = false;
                                                }
                                                return Boolean.valueOf(z);
                                            } else if (methodId == 42) {
                                                if (js_indexOf != 0) {
                                                    z2 = false;
                                                }
                                                return Boolean.valueOf(z2);
                                            } else if (methodId == 43) {
                                                if (js_indexOf == -1) {
                                                    z3 = false;
                                                }
                                                return Boolean.valueOf(z3);
                                            }
                                            break;
                                        case 44:
                                            if (objArr2.length != 0 && !Undefined.isUndefined(objArr2[0])) {
                                                String scriptRuntime10 = ScriptRuntime.toString(objArr2, 0);
                                                Normalizer.Form form = Normalizer.Form.NFD;
                                                if (!form.name().equals(scriptRuntime10)) {
                                                    form = Normalizer.Form.NFKC;
                                                    if (!form.name().equals(scriptRuntime10)) {
                                                        form = Normalizer.Form.NFKD;
                                                        if (!form.name().equals(scriptRuntime10)) {
                                                            form = Normalizer.Form.NFC;
                                                            if (!form.name().equals(scriptRuntime10)) {
                                                                throw ScriptRuntime.rangeError("The normalization form should be one of 'NFC', 'NFD', 'NFKC', 'NFKD'.");
                                                            }
                                                        }
                                                    }
                                                }
                                                return Normalizer.normalize(ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), form);
                                            }
                                            return Normalizer.normalize(ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject)), Normalizer.Form.NFC);
                                        case 45:
                                            return js_repeat(context, scriptable3, idFunctionObject, objArr2);
                                        case 46:
                                            String scriptRuntime11 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            double integer2 = ScriptRuntime.toInteger(objArr2, 0);
                                            if (integer2 >= 0.0d && integer2 < scriptRuntime11.length()) {
                                                return Integer.valueOf(scriptRuntime11.codePointAt((int) integer2));
                                            }
                                            return Undefined.instance;
                                        case 47:
                                        case 48:
                                            break;
                                        case 49:
                                            return new NativeStringIterator(scriptable, ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                        case 52:
                                            String scriptRuntime12 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            if (objArr2.length >= 1) {
                                                obj = objArr2[0];
                                            } else {
                                                obj = Undefined.instance;
                                            }
                                            int length3 = scriptRuntime12.length();
                                            int integer3 = (int) ScriptRuntime.toInteger(obj);
                                            if (integer3 < 0) {
                                                integer3 += length3;
                                            }
                                            if (integer3 >= 0 && integer3 < length3) {
                                                return scriptRuntime12.substring(integer3, integer3 + 1);
                                            }
                                            return Undefined.instance;
                                        case 53:
                                            CharSequence charSequence3 = ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            int length4 = charSequence3.length();
                                            boolean z5 = false;
                                            for (int i4 = 0; i4 < length4; i4++) {
                                                char charAt2 = charSequence3.charAt(i4);
                                                if (NativeJSON.isLeadingSurrogate(charAt2)) {
                                                    if (z5) {
                                                        return Boolean.FALSE;
                                                    }
                                                    z5 = true;
                                                } else if (NativeJSON.isTrailingSurrogate(charAt2)) {
                                                    if (!z5) {
                                                        return Boolean.FALSE;
                                                    }
                                                    z5 = false;
                                                } else if (z5) {
                                                    return Boolean.FALSE;
                                                }
                                            }
                                            return Boolean.valueOf(!z5);
                                        case 54:
                                            CharSequence charSequence4 = ScriptRuntime.toCharSequence(ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject));
                                            HashMap hashMap = new HashMap();
                                            int length5 = charSequence4.length();
                                            int i5 = -1;
                                            int i6 = 0;
                                            char c = 0;
                                            while (i6 < length5) {
                                                char charAt3 = charSequence4.charAt(i6);
                                                if (NativeJSON.isLeadingSurrogate(c) && NativeJSON.isTrailingSurrogate(charAt3)) {
                                                    Integer valueOf = Integer.valueOf(i6 - 1);
                                                    Boolean bool = Boolean.TRUE;
                                                    hashMap.put(valueOf, bool);
                                                    hashMap.put(Integer.valueOf(i6), bool);
                                                } else if (NativeJSON.isLeadingSurrogate(charAt3) || NativeJSON.isTrailingSurrogate(charAt3)) {
                                                    hashMap.put(Integer.valueOf(i6), Boolean.FALSE);
                                                    if (i5 == -1) {
                                                        i5 = i6;
                                                    }
                                                }
                                                i6++;
                                                c = charAt3;
                                            }
                                            if (hashMap.isEmpty()) {
                                                return charSequence4.toString();
                                            }
                                            StringBuilder sb = new StringBuilder(charSequence4.subSequence(0, i5));
                                            while (i5 < length5) {
                                                char charAt4 = charSequence4.charAt(i5);
                                                Boolean bool2 = (Boolean) hashMap.get(Integer.valueOf(i5));
                                                if (bool2 != null && !bool2.booleanValue()) {
                                                    sb.append((char) 65533);
                                                } else {
                                                    sb.append(charAt4);
                                                }
                                                i5++;
                                            }
                                            return sb.toString();
                                        case Token.THROW /* 55 */:
                                            Object requireObjectCoercible = ScriptRuntimeES6.requireObjectCoercible(context, scriptable3, idFunctionObject);
                                            if (objArr2.length > 0) {
                                                obj2 = objArr2[0];
                                            } else {
                                                obj2 = Undefined.instance;
                                            }
                                            RegExpProxy checkRegExpProxy = ScriptRuntime.checkRegExpProxy(context);
                                            if (obj2 != null && !Undefined.isUndefined(obj2)) {
                                                if ((obj2 instanceof Scriptable) && checkRegExpProxy.isRegExp((Scriptable) obj2)) {
                                                    Object objectProp = ScriptRuntime.getObjectProp(obj2, "flags", context, scriptable);
                                                    ScriptRuntimeES6.requireObjectCoercible(context, objectProp, idFunctionObject);
                                                    if (!ScriptRuntime.toString(objectProp).contains("g")) {
                                                        throw ScriptRuntime.typeErrorById("msg.str.match.all.no.global.flag", new Object[0]);
                                                    }
                                                }
                                                SymbolKey symbolKey = SymbolKey.MATCH_ALL;
                                                Object objectElem = ScriptRuntime.getObjectElem(obj2, symbolKey, context, scriptable);
                                                if (objectElem != null && !Undefined.isUndefined(objectElem)) {
                                                    if (objectElem instanceof Callable) {
                                                        return ((Callable) objectElem).call(context, scriptable, ScriptRuntime.toObject(scriptable, obj2), new Object[]{requireObjectCoercible});
                                                    }
                                                    throw ScriptRuntime.notFunctionError(obj2, objectElem, symbolKey.getName());
                                                }
                                            }
                                            String scriptRuntime13 = ScriptRuntime.toString(requireObjectCoercible);
                                            String str3 = str;
                                            if (!Undefined.isUndefined(obj2)) {
                                                str3 = ScriptRuntime.toString(obj2);
                                            }
                                            Scriptable wrapRegExp = checkRegExpProxy.wrapRegExp(context, scriptable, checkRegExpProxy.compileRegExp(context, str3, "g"));
                                            SymbolKey symbolKey2 = SymbolKey.MATCH_ALL;
                                            Object objectElem2 = ScriptRuntime.getObjectElem(wrapRegExp, symbolKey2, context, scriptable);
                                            if (objectElem2 instanceof Callable) {
                                                return ((Callable) objectElem2).call(context, scriptable, wrapRegExp, new Object[]{scriptRuntime13});
                                            }
                                            throw ScriptRuntime.notFunctionError(wrapRegExp, objectElem2, symbolKey2.getName());
                                        default:
                                            vs.m(s21.m("String.prototype has no method: ", idFunctionObject.getFunctionName()));
                                            return null;
                                    }
                                    if (methodId != 47) {
                                        z4 = false;
                                    }
                                    return js_pad(context, scriptable3, idFunctionObject, objArr2, z4);
                            }
                    }
                    if (objArr2.length > 0) {
                        object = ScriptRuntime.toObject(context, scriptable, ScriptRuntime.toCharSequence(objArr2[0]));
                        int length6 = objArr2.length - 1;
                        Object[] objArr3 = new Object[length6];
                        System.arraycopy(objArr2, 1, objArr3, 0, length6);
                        objArr2 = objArr3;
                    } else {
                        object = ScriptRuntime.toObject(context, scriptable, ScriptRuntime.toCharSequence(scriptable3));
                    }
                    scriptable3 = object;
                } else {
                    int length7 = objArr2.length;
                    if (length7 < 1) {
                        return "";
                    }
                    char[] cArr = new char[length7];
                    while (i3 != length7) {
                        cArr[i3] = ScriptRuntime.toUint16(objArr2[i3]);
                        i3++;
                    }
                    return new String(cArr);
                }
            } else {
                int length8 = objArr2.length;
                if (length8 < 1) {
                    return "";
                }
                int[] iArr = new int[length8];
                for (int i7 = 0; i7 != length8; i7++) {
                    Object obj4 = objArr2[i7];
                    int int32 = ScriptRuntime.toInt32(obj4);
                    if (ScriptRuntime.eqNumber(ScriptRuntime.toNumber(obj4), Integer.valueOf(int32)) && Character.isValidCodePoint(int32)) {
                        iArr[i7] = int32;
                    } else {
                        throw ScriptRuntime.rangeError("Invalid code point " + ScriptRuntime.toString(obj4));
                    }
                }
                return new String(iArr, 0, length8);
            }
        }
        return js_raw(context, scriptable, objArr2);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = STRING_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "fromCharCode", 1);
        addIdFunctionProperty(idFunctionObject, obj, -2, "fromCodePoint", 1);
        addIdFunctionProperty(idFunctionObject, obj, -3, "raw", 1);
        addIdFunctionProperty(idFunctionObject, obj, -5, "charAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, -6, "charCodeAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, -7, "indexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, -8, "lastIndexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, -9, "split", 3);
        addIdFunctionProperty(idFunctionObject, obj, -10, "substring", 3);
        addIdFunctionProperty(idFunctionObject, obj, -11, "toLowerCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, -12, "toUpperCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, -13, "substr", 3);
        addIdFunctionProperty(idFunctionObject, obj, -14, "concat", 2);
        addIdFunctionProperty(idFunctionObject, obj, -15, "slice", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_equalsIgnoreCase, "equalsIgnoreCase", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_match, "match", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_search, "search", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_replace, "replace", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_replaceAll, "replaceAll", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_localeCompare, "localeCompare", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_toLocaleLowerCase, "toLocaleLowerCase", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        if (str.equals("length")) {
            return IdScriptableObject.instanceIdInfo(7, 1);
        }
        return super.findInstanceIdInfo(str);
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
            case -1555538761:
                if (str.equals("startsWith")) {
                    c = 3;
                    break;
                }
                break;
            case -1536328588:
                if (str.equals("fontcolor")) {
                    c = 4;
                    break;
                }
                break;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    c = 5;
                    break;
                }
                break;
            case -1413299531:
                if (str.equals("anchor")) {
                    c = 6;
                    break;
                }
                break;
            case -1361633751:
                if (str.equals("charAt")) {
                    c = 7;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c = '\b';
                    break;
                }
                break;
            case -1305276618:
                if (str.equals("codePointAt")) {
                    c = '\t';
                    break;
                }
                break;
            case -1295482945:
                if (str.equals("equals")) {
                    c = '\n';
                    break;
                }
                break;
            case -1233067443:
                if (str.equals("replaceAll")) {
                    c = 11;
                    break;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\f';
                    break;
                }
                break;
            case -1059745447:
                if (str.equals("trimEnd")) {
                    c = '\r';
                    break;
                }
                break;
            case -995871928:
                if (str.equals("padEnd")) {
                    c = 14;
                    break;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    c = 15;
                    break;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    c = 16;
                    break;
                }
                break;
            case -891985998:
                if (str.equals("strike")) {
                    c = 17;
                    break;
                }
                break;
            case -891529231:
                if (str.equals("substr")) {
                    c = 18;
                    break;
                }
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 19;
                    break;
                }
                break;
            case -496262374:
                if (str.equals("trimRight")) {
                    c = 20;
                    break;
                }
                break;
            case -495016608:
                if (str.equals("trimStart")) {
                    c = 21;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 22;
                    break;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 23;
                    break;
                }
                break;
            case 3123:
                if (str.equals("at")) {
                    c = 24;
                    break;
                }
                break;
            case 97536:
                if (str.equals("big")) {
                    c = 25;
                    break;
                }
                break;
            case 114240:
                if (str.equals("sub")) {
                    c = 26;
                    break;
                }
                break;
            case 114254:
                if (str.equals("sup")) {
                    c = 27;
                    break;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    c = 28;
                    break;
                }
                break;
            case 3321850:
                if (str.equals("link")) {
                    c = 29;
                    break;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    c = 30;
                    break;
                }
                break;
            case 90259659:
                if (str.equals("includes")) {
                    c = 31;
                    break;
                }
                break;
            case 93826908:
                if (str.equals("blink")) {
                    c = ' ';
                    break;
                }
                break;
            case 97445748:
                if (str.equals("fixed")) {
                    c = '!';
                    break;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = '\"';
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '#';
                    break;
                }
                break;
            case 109548807:
                if (str.equals("small")) {
                    c = '$';
                    break;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = '%';
                    break;
                }
                break;
            case 231605032:
                if (str.equals("valueOf")) {
                    c = '&';
                    break;
                }
                break;
            case 236609293:
                if (str.equals("normalize")) {
                    c = '\'';
                    break;
                }
                break;
            case 257797441:
                if (str.equals("equalsIgnoreCase")) {
                    c = '(';
                    break;
                }
                break;
            case 296883612:
                if (str.equals("matchAll")) {
                    c = ')';
                    break;
                }
                break;
            case 366554320:
                if (str.equals("fontsize")) {
                    c = '*';
                    break;
                }
                break;
            case 397153782:
                if (str.equals("charCodeAt")) {
                    c = '+';
                    break;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = ',';
                    break;
                }
                break;
            case 757893007:
                if (str.equals("padStart")) {
                    c = '-';
                    break;
                }
                break;
            case 812855195:
                if (str.equals("isWellFormed")) {
                    c = '.';
                    break;
                }
                break;
            case 830635948:
                if (str.equals("toWellFormed")) {
                    c = '/';
                    break;
                }
                break;
            case 1042795819:
                if (str.equals("localeCompare")) {
                    c = '0';
                    break;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = '1';
                    break;
                }
                break;
            case 1507829577:
                if (str.equals("trimLeft")) {
                    c = '2';
                    break;
                }
                break;
            case 1743158238:
                if (str.equals("endsWith")) {
                    c = '3';
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = '4';
                    break;
                }
                break;
            case 2112490563:
                if (str.equals("italics")) {
                    c = '5';
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
                return 42;
            case 4:
                return 26;
            case 5:
                return 36;
            case 6:
                return 28;
            case 7:
                return 5;
            case '\b':
                return 14;
            case '\t':
                return 46;
            case '\n':
                return 29;
            case 11:
                return 34;
            case '\f':
                return 11;
            case '\r':
                return 51;
            case 14:
                return 48;
            case 15:
                return 45;
            case 16:
                return 32;
            case 17:
                return 19;
            case 18:
                return 13;
            case 19:
                return 37;
            case 20:
                return 40;
            case 21:
                return 50;
            case 22:
                return 8;
            case 23:
                return 12;
            case 24:
                return 52;
            case 25:
                return 21;
            case 26:
                return 24;
            case 27:
                return 23;
            case 28:
                return 16;
            case 29:
                return 27;
            case 30:
                return 38;
            case 31:
                return 41;
            case ' ':
                return 22;
            case '!':
                return 18;
            case '\"':
                return 31;
            case '#':
                return 15;
            case '$':
                return 20;
            case '%':
                return 9;
            case '&':
                return 4;
            case '\'':
                return 44;
            case '(':
                return 30;
            case ')':
                return 55;
            case '*':
                return 25;
            case '+':
                return 6;
            case ',':
                return 10;
            case '-':
                return 47;
            case '.':
                return 53;
            case '/':
                return 54;
            case '0':
                return 35;
            case '1':
                return 33;
            case '2':
                return 39;
            case '3':
                return 43;
            case '4':
                return 7;
            case '5':
                return 17;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        if (i >= 0 && i < this.string.length()) {
            return String.valueOf(this.string.charAt(i));
        }
        return super.get(i, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(int i) {
        if (i >= 0 && i < this.string.length()) {
            if (Context.getContext().getLanguageVersion() < 200) {
                return 7;
            }
            return 5;
        }
        return super.getAttributes(i);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "String";
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z, boolean z2) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.getLanguageVersion() >= 200) {
            Object[] ids = super.getIds(z, z2);
            Object[] objArr = new Object[this.string.length() + ids.length];
            int i = 0;
            while (i < this.string.length()) {
                objArr[i] = Integer.valueOf(i);
                i++;
            }
            System.arraycopy(ids, 0, objArr, i, ids.length);
            return objArr;
        }
        return super.getIds(z, z2);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        if (i == 1) {
            return "length";
        }
        return super.getInstanceIdName(i);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        if (i == 1) {
            return ScriptRuntime.wrapInt(this.string.length());
        }
        return super.getInstanceIdValue(i);
    }

    public int getLength() {
        return this.string.length();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        int i;
        if (!(obj instanceof Symbol) && context != null && context.getLanguageVersion() >= 200) {
            ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
            if (stringIdOrIndex.stringId == null && (i = stringIdOrIndex.index) >= 0 && i < this.string.length()) {
                return defaultIndexPropertyDescriptor(String.valueOf(this.string.charAt(stringIdOrIndex.index)));
            }
        }
        return super.getOwnPropertyDescriptor(context, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        if (i >= 0 && i < this.string.length()) {
            return true;
        }
        return super.has(i, scriptable);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        if (i == 49) {
            initPrototypeMethod(STRING_TAG, i, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
            return;
        }
        switch (i) {
            case 1:
                str = "constructor";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 2:
                str2 = "toString";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 3:
                str2 = "toSource";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 4:
                str2 = "valueOf";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 5:
                str = "charAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 6:
                str = "charCodeAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 7:
                str = "indexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 8:
                str = "lastIndexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 9:
                str3 = "split";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 10:
                str3 = "substring";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 11:
                str2 = "toLowerCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 12:
                str2 = "toUpperCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 13:
                str3 = "substr";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 14:
                str = "concat";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 15:
                str3 = "slice";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 16:
                str2 = "bold";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 17:
                str2 = "italics";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 18:
                str2 = "fixed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 19:
                str2 = "strike";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 20:
                str2 = "small";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 21:
                str2 = "big";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 22:
                str2 = "blink";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 23:
                str2 = "sup";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 24:
                str2 = "sub";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 25:
                str2 = "fontsize";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 26:
                str2 = "fontcolor";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 27:
                str2 = "link";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 28:
                str2 = "anchor";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 29:
                str = "equals";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 30:
                str = "equalsIgnoreCase";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 31:
                str = "match";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 32:
                str = "search";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 33:
                str3 = "replace";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 34:
                str3 = "replaceAll";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 35:
                str = "localeCompare";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 36:
                str2 = "toLocaleLowerCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 37:
                str2 = "toLocaleUpperCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 38:
                str2 = "trim";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 39:
                str2 = "trimLeft";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 40:
                str2 = "trimRight";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 41:
                str = "includes";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 42:
                str = "startsWith";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 43:
                str = "endsWith";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 44:
                str2 = "normalize";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 45:
                str = "repeat";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 46:
                str = "codePointAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 47:
                str = "padStart";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 48:
                str = "padEnd";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 49:
            default:
                vs.m(String.valueOf(i));
                return;
            case 50:
                str2 = "trimStart";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 51:
                str2 = "trimEnd";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 52:
                str = "at";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 53:
                str2 = "isWellFormed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case 54:
                str2 = "toWellFormed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
            case Token.THROW /* 55 */:
                str = "matchAll";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                return;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        if (i >= 0 && i < this.string.length()) {
            return;
        }
        super.put(i, scriptable, obj);
    }

    public CharSequence toCharSequence() {
        return this.string;
    }

    public String toString() {
        CharSequence charSequence = this.string;
        if (charSequence instanceof String) {
            return (String) charSequence;
        }
        return charSequence.toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.ITERATOR.equals(symbol) ? 49 : 0;
    }
}
