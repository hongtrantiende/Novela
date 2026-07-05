package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.xml.XMLLib;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeGlobal implements Serializable, IdFunctionCall {
    private static final Object FTAG = "Global";
    private static final int INVALID_UTF8 = Integer.MAX_VALUE;
    private static final int Id_decodeURI = 1;
    private static final int Id_decodeURIComponent = 2;
    private static final int Id_encodeURI = 3;
    private static final int Id_encodeURIComponent = 4;
    private static final int Id_escape = 5;
    private static final int Id_eval = 6;
    private static final int Id_isFinite = 7;
    private static final int Id_isNaN = 8;
    private static final int Id_isXMLName = 9;
    private static final int Id_new_AggregateError = 15;
    private static final int Id_new_CommonError = 14;
    private static final int Id_parseFloat = 10;
    private static final int Id_parseInt = 11;
    private static final int Id_unescape = 12;
    private static final int Id_uneval = 13;
    private static final int LAST_SCOPE_FUNCTION_ID = 13;
    private static final String URI_DECODE_RESERVED = ";/?:@&=+$,#";
    static final long serialVersionUID = 6080442165748707530L;

    @Deprecated
    public static EcmaError constructError(Context context, String str, String str2, Scriptable scriptable, String str3, int i, int i2, String str4) {
        return ScriptRuntime.constructError(str, str2, str3, i, str4, i2);
    }

    private static String decode(String str, boolean z) {
        int i;
        int i2;
        char c;
        int length = str.length();
        char[] cArr = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 != length) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (cArr != null) {
                    cArr[i4] = charAt;
                    i4++;
                }
                i3++;
            } else {
                if (cArr == null) {
                    cArr = new char[length];
                    str.getChars(0, i3, cArr, 0);
                    i4 = i3;
                }
                int i5 = i3 + 3;
                if (i5 <= length) {
                    int unHex = unHex(str.charAt(i3 + 1), str.charAt(i3 + 2));
                    if (unHex >= 0) {
                        if ((unHex & Token.CASE) != 0) {
                            if ((unHex & 192) != 128) {
                                if ((unHex & 32) == 0) {
                                    unHex &= 31;
                                    i = 1;
                                    i2 = 128;
                                } else if ((unHex & 16) == 0) {
                                    unHex &= 15;
                                    i = 2;
                                    i2 = 2048;
                                } else if ((unHex & 8) == 0) {
                                    unHex &= 7;
                                    i = 3;
                                    i2 = 65536;
                                } else if ((unHex & 4) == 0) {
                                    unHex &= 3;
                                    i = 4;
                                    i2 = 2097152;
                                } else if ((unHex & 2) == 0) {
                                    unHex &= 1;
                                    i = 5;
                                    i2 = 67108864;
                                } else {
                                    throw uriError();
                                }
                                if ((i * 3) + i5 <= length) {
                                    for (int i6 = 0; i6 != i; i6++) {
                                        if (str.charAt(i5) == '%') {
                                            int unHex2 = unHex(str.charAt(i5 + 1), str.charAt(i5 + 2));
                                            if (unHex2 >= 0 && (unHex2 & 192) == 128) {
                                                unHex = (unHex << 6) | (unHex2 & 63);
                                                i5 += 3;
                                            } else {
                                                throw uriError();
                                            }
                                        } else {
                                            throw uriError();
                                        }
                                    }
                                    if (unHex >= i2 && (unHex < 55296 || unHex > 57343)) {
                                        if (unHex == 65534 || unHex == 65535) {
                                            unHex = 65533;
                                        }
                                    } else {
                                        unHex = INVALID_UTF8;
                                    }
                                    if (unHex >= 65536) {
                                        int i7 = unHex - Parser.ARGC_LIMIT;
                                        if (i7 <= 1048575) {
                                            cArr[i4] = (char) ((i7 >>> 10) + 55296);
                                            c = (char) ((i7 & 1023) + 56320);
                                            i4++;
                                            if (!z && URI_DECODE_RESERVED.indexOf(c) >= 0) {
                                                while (i3 != i5) {
                                                    cArr[i4] = str.charAt(i3);
                                                    i3++;
                                                    i4++;
                                                }
                                            } else {
                                                cArr[i4] = c;
                                                i4++;
                                            }
                                            i3 = i5;
                                        } else {
                                            throw uriError();
                                        }
                                    }
                                } else {
                                    throw uriError();
                                }
                            } else {
                                throw uriError();
                            }
                        }
                        c = (char) unHex;
                        if (!z) {
                        }
                        cArr[i4] = c;
                        i4++;
                        i3 = i5;
                    } else {
                        throw uriError();
                    }
                } else {
                    throw uriError();
                }
            }
        }
        if (cArr == null) {
            return str;
        }
        return new String(cArr, 0, i4);
    }

    private static String encode(String str, boolean z) {
        int length = str.length();
        StringBuilder sb = null;
        byte[] bArr = null;
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            sb = sb;
            if (encodeUnescaped(charAt, z)) {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else {
                if (sb == null) {
                    StringBuilder sb2 = new StringBuilder(length + 3);
                    sb2.append(str);
                    sb2.setLength(i);
                    bArr = new byte[6];
                    sb = sb2;
                }
                if (56320 <= charAt && charAt <= 57343) {
                    throw uriError();
                }
                char c = charAt;
                if (charAt >= 55296) {
                    c = charAt;
                    if (56319 >= charAt) {
                        i++;
                        if (i != length) {
                            char charAt2 = str.charAt(i);
                            if (56320 <= charAt2 && charAt2 <= 57343) {
                                c = Parser.ARGC_LIMIT + (charAt2 - 56320) + ((charAt - 55296) << 10);
                            } else {
                                throw uriError();
                            }
                        } else {
                            throw uriError();
                        }
                    }
                }
                int oneUcs4ToUtf8Char = oneUcs4ToUtf8Char(bArr, c);
                for (int i2 = 0; i2 < oneUcs4ToUtf8Char; i2++) {
                    byte b = bArr[i2];
                    sb.append('%');
                    sb.append(toHexChar((b & 255) >>> 4));
                    sb.append(toHexChar(b & 15));
                }
            }
            i++;
            sb = sb;
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    private static boolean encodeUnescaped(char c, boolean z) {
        if (('A' <= c && c <= 'Z') || (('a' <= c && c <= 'z') || (('0' <= c && c <= '9') || "-_.!~*'()".indexOf(c) >= 0))) {
            return true;
        }
        if (z && URI_DECODE_RESERVED.indexOf(c) >= 0) {
            return true;
        }
        return false;
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        IdFunctionObject idFunctionObject;
        String str;
        String str2;
        int i;
        NativeGlobal nativeGlobal = new NativeGlobal();
        for (int i2 = 1; i2 <= 13; i2++) {
            switch (i2) {
                case 1:
                    str = "decodeURI";
                    str2 = str;
                    i = 1;
                    break;
                case 2:
                    str = "decodeURIComponent";
                    str2 = str;
                    i = 1;
                    break;
                case 3:
                    str = "encodeURI";
                    str2 = str;
                    i = 1;
                    break;
                case 4:
                    str = "encodeURIComponent";
                    str2 = str;
                    i = 1;
                    break;
                case 5:
                    str = "escape";
                    str2 = str;
                    i = 1;
                    break;
                case 6:
                    str = "eval";
                    str2 = str;
                    i = 1;
                    break;
                case 7:
                    str = "isFinite";
                    str2 = str;
                    i = 1;
                    break;
                case 8:
                    str = "isNaN";
                    str2 = str;
                    i = 1;
                    break;
                case 9:
                    str = "isXMLName";
                    str2 = str;
                    i = 1;
                    break;
                case 10:
                    str = "parseFloat";
                    str2 = str;
                    i = 1;
                    break;
                case 11:
                    str2 = "parseInt";
                    i = 2;
                    break;
                case 12:
                    str = "unescape";
                    str2 = str;
                    i = 1;
                    break;
                case 13:
                    str = "uneval";
                    str2 = str;
                    i = 1;
                    break;
                default:
                    throw Kit.codeBug();
            }
            IdFunctionObject idFunctionObject2 = new IdFunctionObject(nativeGlobal, FTAG, i2, str2, i, scriptable);
            if (z) {
                idFunctionObject2.sealObject();
            }
            idFunctionObject2.exportAsScopeProperty();
        }
        Scriptable scriptable2 = scriptable;
        ScriptableObject.defineProperty(scriptable2, "NaN", ScriptRuntime.NaNobj, 7);
        ScriptableObject.defineProperty(scriptable2, "Infinity", ScriptRuntime.wrapNumber(Double.POSITIVE_INFINITY), 7);
        ScriptableObject.defineProperty(scriptable2, "undefined", Undefined.instance, 7);
        ScriptableObject.defineProperty(scriptable2, "globalThis", scriptable2, 2);
        Scriptable ensureScriptable = ScriptableObject.ensureScriptable(ScriptableObject.getProperty(scriptable2, "Error"));
        Scriptable ensureScriptable2 = ScriptableObject.ensureScriptable(ScriptableObject.getProperty(ensureScriptable, "prototype"));
        TopLevel.NativeErrors[] values = TopLevel.NativeErrors.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            TopLevel.NativeErrors nativeErrors = values[i3];
            if (nativeErrors != TopLevel.NativeErrors.Error) {
                String name = nativeErrors.name();
                Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable2);
                NativeError makeProto = NativeError.makeProto(topLevelScope, (IdFunctionObject) TopLevel.getBuiltinCtor(context, topLevelScope, TopLevel.Builtins.Error));
                makeProto.defineProperty("name", name, 2);
                makeProto.defineProperty("message", "", 2);
                if (nativeErrors == TopLevel.NativeErrors.AggregateError) {
                    idFunctionObject = new IdFunctionObject(nativeGlobal, FTAG, 15, name, 2, scriptable2);
                } else {
                    idFunctionObject = new IdFunctionObject(nativeGlobal, FTAG, 14, name, 1, scriptable);
                }
                idFunctionObject.markAsConstructor(makeProto);
                idFunctionObject.setPrototype(ensureScriptable);
                makeProto.put("constructor", makeProto, idFunctionObject);
                makeProto.setAttributes("constructor", 2);
                makeProto.setPrototype(ensureScriptable2);
                if (z) {
                    makeProto.sealObject();
                    idFunctionObject.sealObject();
                }
                idFunctionObject.setAttributes("name", 3);
                idFunctionObject.setAttributes("length", 3);
                idFunctionObject.exportAsScopeProperty();
            }
            i3++;
            scriptable2 = scriptable;
        }
    }

    public static boolean isEvalFunction(Object obj) {
        if (obj instanceof IdFunctionObject) {
            IdFunctionObject idFunctionObject = (IdFunctionObject) obj;
            if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r11 & (-8)) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_escape(java.lang.Object[] r11) {
        /*
            r0 = 0
            java.lang.String r1 = org.mozilla.javascript.ScriptRuntime.toString(r11, r0)
            int r2 = r11.length
            r3 = 1
            if (r2 <= r3) goto L29
            r11 = r11[r3]
            double r4 = org.mozilla.javascript.ScriptRuntime.toNumber(r11)
            boolean r11 = java.lang.Double.isNaN(r4)
            if (r11 != 0) goto L20
            int r11 = (int) r4
            double r6 = (double) r11
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L20
            r2 = r11 & (-8)
            if (r2 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r11 = "msg.bad.esc.mask"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.mozilla.javascript.EvaluatorException r11 = org.mozilla.javascript.Context.reportRuntimeErrorById(r11, r0)
            throw r11
        L29:
            r11 = 7
        L2a:
            int r2 = r1.length()
            r4 = 0
        L2f:
            if (r0 == r2) goto Lc0
            char r5 = r1.charAt(r0)
            r6 = 43
            if (r11 == 0) goto L76
            r7 = 48
            if (r5 < r7) goto L41
            r7 = 57
            if (r5 <= r7) goto L6f
        L41:
            r7 = 65
            if (r5 < r7) goto L49
            r7 = 90
            if (r5 <= r7) goto L6f
        L49:
            r7 = 97
            if (r5 < r7) goto L51
            r7 = 122(0x7a, float:1.71E-43)
            if (r5 <= r7) goto L6f
        L51:
            r7 = 64
            if (r5 == r7) goto L6f
            r7 = 42
            if (r5 == r7) goto L6f
            r7 = 95
            if (r5 == r7) goto L6f
            r7 = 45
            if (r5 == r7) goto L6f
            r7 = 46
            if (r5 == r7) goto L6f
            r7 = r11 & 4
            if (r7 == 0) goto L76
            r7 = 47
            if (r5 == r7) goto L6f
            if (r5 != r6) goto L76
        L6f:
            if (r4 == 0) goto Lbc
            char r5 = (char) r5
            r4.append(r5)
            goto Lbc
        L76:
            if (r4 != 0) goto L85
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r7 = r2 + 3
            r4.<init>(r7)
            r4.append(r1)
            r4.setLength(r0)
        L85:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 37
            r9 = 4
            if (r5 >= r7) goto L9b
            r7 = 32
            r10 = 2
            if (r5 != r7) goto L97
            if (r11 != r10) goto L97
            r4.append(r6)
            goto Lbc
        L97:
            r4.append(r8)
            goto La4
        L9b:
            r4.append(r8)
            r6 = 117(0x75, float:1.64E-43)
            r4.append(r6)
            r10 = r9
        La4:
            int r10 = r10 - r3
            int r10 = r10 * r9
        La6:
            if (r10 < 0) goto Lbc
            int r6 = r5 >> r10
            r6 = r6 & 15
            r7 = 10
            if (r6 >= r7) goto Lb3
            int r6 = r6 + 48
            goto Lb5
        Lb3:
            int r6 = r6 + 55
        Lb5:
            char r6 = (char) r6
            r4.append(r6)
            int r10 = r10 + (-4)
            goto La6
        Lbc:
            int r0 = r0 + 1
            goto L2f
        Lc0:
            if (r4 != 0) goto Lc3
            return r1
        Lc3:
            java.lang.String r11 = r4.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGlobal.js_escape(java.lang.Object[]):java.lang.Object");
    }

    private static Object js_eval(Context context, Scriptable scriptable, Object[] objArr) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        return ScriptRuntime.evalSpecial(context, topLevelScope, topLevelScope, objArr, "eval code", 1);
    }

    public static Object js_parseFloat(Object[] objArr) {
        int i;
        double d;
        if (objArr.length < 1) {
            return ScriptRuntime.NaNobj;
        }
        boolean z = false;
        String scriptRuntime = ScriptRuntime.toString(objArr[0]);
        int length = scriptRuntime.length();
        for (int i2 = 0; i2 != length; i2++) {
            char charAt = scriptRuntime.charAt(i2);
            if (!ScriptRuntime.isStrWhiteSpaceChar(charAt)) {
                if (charAt != '+' && charAt != '-') {
                    i = i2;
                } else {
                    int i3 = i2 + 1;
                    if (i3 == length) {
                        return ScriptRuntime.NaNobj;
                    }
                    i = i3;
                    charAt = scriptRuntime.charAt(i3);
                }
                if (charAt == 'I') {
                    if (i + 8 <= length && scriptRuntime.regionMatches(i, "Infinity", 0, 8)) {
                        if (scriptRuntime.charAt(i2) == '-') {
                            d = Double.NEGATIVE_INFINITY;
                        } else {
                            d = Double.POSITIVE_INFINITY;
                        }
                        return ScriptRuntime.wrapNumber(d);
                    }
                    return ScriptRuntime.NaNobj;
                }
                int i4 = -1;
                int i5 = -1;
                while (true) {
                    if (i < length) {
                        char charAt2 = scriptRuntime.charAt(i);
                        if (charAt2 != '+') {
                            if (charAt2 != 'E' && charAt2 != 'e') {
                                if (charAt2 != '-') {
                                    if (charAt2 != '.') {
                                        switch (charAt2) {
                                            case Token.THIS /* 48 */:
                                            case Token.FALSE /* 49 */:
                                            case Token.TRUE /* 50 */:
                                            case Token.SHEQ /* 51 */:
                                            case Token.SHNE /* 52 */:
                                            case Token.REGEXP /* 53 */:
                                            case Token.BINDNAME /* 54 */:
                                            case Token.THROW /* 55 */:
                                            case Token.RETHROW /* 56 */:
                                            case Token.IN /* 57 */:
                                                if (i4 != -1) {
                                                    z = true;
                                                }
                                                i++;
                                        }
                                    } else if (i5 == -1) {
                                        i5 = i;
                                        i++;
                                    }
                                }
                            } else if (i4 == -1 && i != length - 1) {
                                i4 = i;
                                i++;
                            }
                        }
                        if (i4 == i - 1) {
                            if (i == length - 1) {
                                i--;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (i4 == -1 || z) {
                    i4 = i;
                }
                try {
                    return Double.valueOf(scriptRuntime.substring(i2, i4));
                } catch (NumberFormatException unused) {
                    return ScriptRuntime.NaNobj;
                }
            }
        }
        return ScriptRuntime.NaNobj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object js_parseInt(org.mozilla.javascript.Context r11, java.lang.Object[] r12) {
        /*
            r0 = 0
            java.lang.String r1 = org.mozilla.javascript.ScriptRuntime.toString(r12, r0)
            r2 = 1
            int r12 = org.mozilla.javascript.ScriptRuntime.toInt32(r12, r2)
            int r3 = r1.length()
            if (r3 != 0) goto L13
            java.lang.Double r11 = org.mozilla.javascript.ScriptRuntime.NaNobj
            return r11
        L13:
            r4 = r0
        L14:
            char r5 = r1.charAt(r4)
            boolean r6 = org.mozilla.javascript.ScriptRuntime.isStrWhiteSpaceChar(r5)
            if (r6 != 0) goto L1f
            goto L23
        L1f:
            int r4 = r4 + 1
            if (r4 < r3) goto L14
        L23:
            r6 = 43
            if (r5 == r6) goto L2e
            r6 = 45
            if (r5 != r6) goto L2c
            r0 = r2
        L2c:
            if (r0 == 0) goto L30
        L2e:
            int r4 = r4 + 1
        L30:
            r5 = 88
            r6 = 120(0x78, float:1.68E-43)
            r7 = 16
            r8 = -1
            r9 = 48
            if (r12 != 0) goto L3d
            r12 = r8
            goto L5d
        L3d:
            r10 = 2
            if (r12 < r10) goto L9a
            r10 = 36
            if (r12 <= r10) goto L45
            goto L9a
        L45:
            if (r12 != r7) goto L5d
            int r10 = r3 - r4
            if (r10 <= r2) goto L5d
            char r10 = r1.charAt(r4)
            if (r10 != r9) goto L5d
            int r10 = r4 + 1
            char r10 = r1.charAt(r10)
            if (r10 == r6) goto L5b
            if (r10 != r5) goto L5d
        L5b:
            int r4 = r4 + 2
        L5d:
            if (r12 != r8) goto L8d
            int r3 = r3 - r4
            if (r3 <= r2) goto L8a
            char r12 = r1.charAt(r4)
            if (r12 != r9) goto L8a
            int r12 = r4 + 1
            char r2 = r1.charAt(r12)
            if (r2 == r6) goto L87
            if (r2 != r5) goto L73
            goto L87
        L73:
            if (r9 > r2) goto L8a
            r3 = 57
            if (r2 > r3) goto L8a
            if (r11 == 0) goto L83
            int r11 = r11.getLanguageVersion()
            r2 = 150(0x96, float:2.1E-43)
            if (r11 >= r2) goto L8a
        L83:
            r7 = 8
            r4 = r12
            goto L8e
        L87:
            int r4 = r4 + 2
            goto L8e
        L8a:
            r7 = 10
            goto L8e
        L8d:
            r7 = r12
        L8e:
            double r11 = org.mozilla.javascript.ScriptRuntime.stringPrefixToNumber(r1, r4, r7)
            if (r0 == 0) goto L95
            double r11 = -r11
        L95:
            java.lang.Number r11 = org.mozilla.javascript.ScriptRuntime.wrapNumber(r11)
            return r11
        L9a:
            java.lang.Double r11 = org.mozilla.javascript.ScriptRuntime.NaNobj
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGlobal.js_parseInt(org.mozilla.javascript.Context, java.lang.Object[]):java.lang.Object");
    }

    private static Object js_unescape(Object[] objArr) {
        int i;
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        int indexOf = scriptRuntime.indexOf(37);
        if (indexOf >= 0) {
            int length = scriptRuntime.length();
            char[] charArray = scriptRuntime.toCharArray();
            int i2 = indexOf;
            while (indexOf != length) {
                char c = charArray[indexOf];
                int i3 = indexOf + 1;
                if (c == '%' && i3 != length) {
                    if (charArray[i3] == 'u') {
                        i = indexOf + 2;
                        indexOf += 6;
                    } else {
                        indexOf += 3;
                        i = i3;
                    }
                    if (indexOf <= length) {
                        int i4 = 0;
                        while (i != indexOf) {
                            i4 = Kit.xDigitToInt(charArray[i], i4);
                            i++;
                        }
                        if (i4 >= 0) {
                            c = (char) i4;
                            charArray[i2] = c;
                            i2++;
                        }
                    }
                }
                indexOf = i3;
                charArray[i2] = c;
                i2++;
            }
            return new String(charArray, 0, i2);
        }
        return scriptRuntime;
    }

    private static int oneUcs4ToUtf8Char(byte[] bArr, int i) {
        if ((i & (-128)) == 0) {
            bArr[0] = (byte) i;
            return 1;
        }
        int i2 = i >>> 11;
        int i3 = 2;
        while (i2 != 0) {
            i2 >>>= 5;
            i3++;
        }
        int i4 = i3;
        while (true) {
            i4--;
            if (i4 > 0) {
                bArr[i4] = (byte) ((i & 63) | Token.CASE);
                i >>>= 6;
            } else {
                bArr[0] = (byte) ((256 - (1 << (8 - i3))) + i);
                return i3;
            }
        }
    }

    private static char toHexChar(int i) {
        int i2;
        if ((i >> 4) != 0) {
            Kit.codeBug();
        }
        if (i < 10) {
            i2 = i + 48;
        } else {
            i2 = i + 55;
        }
        return (char) i2;
    }

    private static int unHex(char c) {
        if ('A' <= c && c <= 'F') {
            return c - '7';
        }
        if ('a' <= c && c <= 'f') {
            return c - 'W';
        }
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        return -1;
    }

    private static EcmaError uriError() {
        return ScriptRuntime.constructError("URIError", ScriptRuntime.getMessageById("msg.bad.uri", new Object[0]));
    }

    @Override // org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2;
        if (idFunctionObject.hasTag(FTAG)) {
            int methodId = idFunctionObject.methodId();
            boolean z = true;
            switch (methodId) {
                case 1:
                case 2:
                    String scriptRuntime = ScriptRuntime.toString(objArr, 0);
                    if (methodId != 1) {
                        z = false;
                    }
                    return decode(scriptRuntime, z);
                case 3:
                case 4:
                    String scriptRuntime2 = ScriptRuntime.toString(objArr, 0);
                    if (methodId != 3) {
                        z = false;
                    }
                    return encode(scriptRuntime2, z);
                case 5:
                    return js_escape(objArr);
                case 6:
                    return js_eval(context, scriptable, objArr);
                case 7:
                    if (objArr.length < 1) {
                        return Boolean.FALSE;
                    }
                    return NativeNumber.isFinite(objArr[0]);
                case 8:
                    if (objArr.length >= 1) {
                        z = Double.isNaN(ScriptRuntime.toNumber(objArr[0]));
                    }
                    return ScriptRuntime.wrapBoolean(z);
                case 9:
                    if (objArr.length == 0) {
                        obj = Undefined.instance;
                    } else {
                        obj = objArr[0];
                    }
                    return ScriptRuntime.wrapBoolean(XMLLib.extractFromScope(scriptable).isXMLName(context, obj));
                case 10:
                    return js_parseFloat(objArr);
                case 11:
                    return js_parseInt(context, objArr);
                case 12:
                    return js_unescape(objArr);
                case 13:
                    if (objArr.length != 0) {
                        obj2 = objArr[0];
                    } else {
                        obj2 = Undefined.instance;
                    }
                    return ScriptRuntime.uneval(context, scriptable, obj2);
                case 14:
                    return NativeError.make(context, scriptable, idFunctionObject, objArr);
                case 15:
                    return NativeError.makeAggregate(context, scriptable, idFunctionObject, objArr);
            }
        }
        throw idFunctionObject.unknown();
    }

    @Deprecated
    public static EcmaError constructError(Context context, String str, String str2, Scriptable scriptable) {
        return ScriptRuntime.constructError(str, str2);
    }

    private static int unHex(char c, char c2) {
        int unHex = unHex(c);
        int unHex2 = unHex(c2);
        if (unHex < 0 || unHex2 < 0) {
            return -1;
        }
        return (unHex << 4) | unHex2;
    }
}
