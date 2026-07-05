package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fi1  reason: default package */
/* loaded from: classes3.dex */
public final class fi1 {
    public static final int E;
    public static final int F;
    public static final boolean G;
    public ArrayList A;
    public ArrayList B;
    public final String d;
    public ky3[] e;
    public int f;
    public int[] g;
    public int h;
    public int j;
    public final h02 k;
    public ai1 l;
    public int m;
    public int n;
    public int o;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public int[] w;
    public int x;
    public long[] y;
    public int z;
    public int[] a = null;
    public int b = 0;
    public HashMap c = null;
    public byte[] i = new byte[256];
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public int C = 0;
    public char[] D = new char[64];

    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    static {
        /*
            r0 = 1
            r1 = 50
            r2 = 0
            r3 = 48
            java.lang.Class<fi1> r4 = defpackage.fi1.class
            java.lang.String r5 = "ClassFileWriter.class"
            java.io.InputStream r4 = r4.getResourceAsStream(r5)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            if (r4 != 0) goto L16
            java.lang.String r4 = "org/mozilla/classfile/ClassFileWriter.class"
            java.io.InputStream r4 = java.lang.ClassLoader.getSystemResourceAsStream(r4)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
        L16:
            if (r4 == 0) goto L4a
            r5 = 8
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L2f
            r7 = r2
        L1d:
            if (r7 >= r5) goto L32
            int r8 = 8 - r7
            int r8 = r4.read(r6, r7, r8)     // Catch: java.lang.Throwable -> L2f
            if (r8 < 0) goto L29
            int r7 = r7 + r8
            goto L1d
        L29:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f
            r5.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            r5 = move-exception
            r7 = r2
            goto L65
        L32:
            r7 = 4
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L2f
            int r7 = r7 << r5
            r8 = 5
            r8 = r6[r8]     // Catch: java.lang.Throwable -> L2f
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            r8 = 6
            r8 = r6[r8]     // Catch: java.lang.Throwable -> L48
            int r5 = r8 << 8
            r8 = 7
            r3 = r6[r8]     // Catch: java.lang.Throwable -> L48
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            goto L52
        L48:
            r5 = move-exception
            goto L65
        L4a:
            java.io.PrintStream r5 = java.lang.System.err     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "Warning: Unable to read ClassFileWriter.class, using default bytecode version"
            r5.println(r6)     // Catch: java.lang.Throwable -> L2f
            r7 = r2
        L52:
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
            goto L5a
        L58:
            r4 = move-exception
            goto L7c
        L5a:
            defpackage.fi1.F = r7
            defpackage.fi1.E = r3
            if (r3 < r1) goto L61
            goto L62
        L61:
            r0 = r2
        L62:
            defpackage.fi1.G = r0
            return
        L65:
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
        L70:
            r4 = move-exception
            r7 = r2
            goto L7c
        L73:
            r7 = r2
        L74:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Can't read ClassFileWriter.class to get bytecode version"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L58
            throw r4     // Catch: java.lang.Throwable -> L58
        L7c:
            defpackage.fi1.F = r7
            defpackage.fi1.E = r3
            if (r3 < r1) goto L83
            goto L84
        L83:
            r0 = r2
        L84:
            defpackage.fi1.G = r0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.<clinit>():void");
    }

    public fi1(String str, String str2, String str3) {
        this.d = str;
        h02 h02Var = new h02(this);
        this.k = h02Var;
        this.t = h02Var.a(str);
        this.u = h02Var.a(str2);
        if (str3 != null) {
            this.v = h02Var.i(str3);
        }
        this.s = 33;
    }

    public static void A(int i) {
        String j;
        if (i < 0) {
            j = a82.j(i, "Stack underflow: ");
        } else {
            j = a82.j(i, "Too big stack: ");
        }
        throw new IllegalStateException(j);
    }

    public static String B(String str) {
        char charAt = str.charAt(0);
        if (charAt != 'F') {
            if (charAt != 'L') {
                if (charAt == 'S' || charAt == 'V' || charAt == 'I' || charAt == 'J' || charAt == 'Z' || charAt == '[') {
                    return str;
                }
                switch (charAt) {
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    case Token.ENUM_NEXT /* 67 */:
                    case Token.ENUM_ID /* 68 */:
                        return str;
                    default:
                        vs.m("bad descriptor:".concat(str));
                        return null;
                }
            }
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static int I(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        return i2 + 2;
    }

    public static int J(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        return i2 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int L(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.L(java.lang.String):int");
    }

    public static int M(int i) {
        if (i == 254 || i == 255) {
            return 0;
        }
        switch (i) {
            case 0:
            case Token.NULL /* 47 */:
            case Token.FALSE /* 49 */:
            case Token.RC /* 95 */:
            case Token.COLON /* 116 */:
            case Token.OR /* 117 */:
            case Token.AND /* 118 */:
            case Token.INC /* 119 */:
            case Token.FOR /* 132 */:
            case Token.CONTINUE /* 134 */:
            case Token.FINALLY /* 138 */:
            case Token.VOID /* 139 */:
            case Token.BLOCK /* 143 */:
            case Token.TARGET /* 145 */:
            case Token.LOOP /* 146 */:
            case Token.EXPR_VOID /* 147 */:
            case Token.LET /* 167 */:
            case Token.SETCONST /* 169 */:
            case Token.METHOD /* 177 */:
            case Token.ARROW /* 178 */:
            case Token.YIELD_STAR /* 179 */:
            case Token.DOTDOTDOT /* 184 */:
            case Token.QUESTION_DOT /* 186 */:
            case 188:
            case 189:
            case 190:
            case 192:
            case 193:
            case 196:
            case Context.VERSION_ES6 /* 200 */:
            case 202:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Token.GETPROPNOWARN /* 34 */:
            case Token.GETPROP_SUPER /* 35 */:
            case Token.GETPROPNOWARN_SUPER /* 36 */:
            case Token.SETPROP /* 37 */:
            case Token.SETELEM_SUPER /* 42 */:
            case Token.CALL /* 43 */:
            case Token.NAME /* 44 */:
            case Token.NUMBER /* 45 */:
            case 89:
            case Token.TRY /* 90 */:
            case Token.SEMI /* 91 */:
            case Token.BREAK /* 133 */:
            case Token.VAR /* 135 */:
            case 140:
            case Token.EMPTY /* 141 */:
            case Token.CONST /* 168 */:
            case Token.LAST_TOKEN /* 187 */:
            case 197:
            case 201:
                return 1;
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 22:
            case 24:
            case 30:
            case 31:
            case 32:
            case Token.GETPROP /* 33 */:
            case Token.SETPROP_SUPER /* 38 */:
            case Token.GETELEM /* 39 */:
            case Token.GETELEM_SUPER /* 40 */:
            case Token.SETELEM /* 41 */:
            case Token.LB /* 92 */:
            case Token.RB /* 93 */:
            case Token.LC /* 94 */:
                return 2;
            case Token.STRING /* 46 */:
            case Token.THIS /* 48 */:
            case Token.TRUE /* 50 */:
            case Token.SHEQ /* 51 */:
            case Token.SHNE /* 52 */:
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
            case Token.RETHROW /* 56 */:
            case Token.INSTANCEOF /* 58 */:
            case Token.LOCAL_LOAD /* 59 */:
            case Token.GETVAR /* 60 */:
            case Token.SETVAR /* 61 */:
            case Token.CATCH_SCOPE /* 62 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
            case Token.THISFN /* 69 */:
            case Token.RETURN_RESULT /* 70 */:
            case Token.DEL_REF /* 75 */:
            case Token.REF_CALL /* 76 */:
            case Token.REF_SPECIAL /* 77 */:
            case Token.YIELD /* 78 */:
            case Token.REF_NAME /* 87 */:
            case Token.LP /* 96 */:
            case Token.COMMA /* 98 */:
            case 100:
            case 102:
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
            case Token.ASSIGN_RSH /* 106 */:
            case Token.ASSIGN_ADD /* 108 */:
            case 110:
            case Token.ASSIGN_MOD /* 112 */:
            case 114:
            case 120:
            case Token.DOT /* 121 */:
            case Token.FUNCTION /* 122 */:
            case Token.EXPORT /* 123 */:
            case Token.IMPORT /* 124 */:
            case Token.IF /* 125 */:
            case Token.ELSE /* 126 */:
            case Token.CASE /* 128 */:
            case 130:
            case Token.WITH /* 136 */:
            case Token.CATCH /* 137 */:
            case Token.COMPUTED_PROPERTY /* 142 */:
            case Token.LABEL /* 144 */:
            case Token.JSR /* 149 */:
            case 150:
            case Token.SETPROP_OP /* 153 */:
            case Token.SETELEM_OP /* 154 */:
            case Token.LOCAL_BLOCK /* 155 */:
            case Token.SET_REF_OP /* 156 */:
            case Token.DOTDOT /* 157 */:
            case Token.COLONCOLON /* 158 */:
            case 170:
            case Token.ARRAYCOMP /* 171 */:
            case Token.LETEXPR /* 172 */:
            case Token.DEBUGGER /* 174 */:
            case Token.GENEXPR /* 176 */:
            case 180:
            case Token.TEMPLATE_CHARS /* 181 */:
            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
            case 185:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                return -1;
            case Token.THROW /* 55 */:
            case Token.IN /* 57 */:
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ARRAYLIT /* 71 */:
            case Token.OBJECTLIT /* 72 */:
            case Token.GET_REF /* 73 */:
            case Token.SET_REF /* 74 */:
            case Token.REF_NS_NAME /* 88 */:
            case Token.RP /* 97 */:
            case 99:
            case 101:
            case Token.ASSIGN_BITAND /* 103 */:
            case Token.ASSIGN_LSH /* 105 */:
            case Token.ASSIGN_URSH /* 107 */:
            case Token.ASSIGN_SUB /* 109 */:
            case Token.ASSIGN_DIV /* 111 */:
            case Token.ASSIGN_EXP /* 113 */:
            case Token.HOOK /* 115 */:
            case Token.SWITCH /* 127 */:
            case Token.DEFAULT /* 129 */:
            case Token.DO /* 131 */:
            case Token.XML /* 159 */:
            case 160:
            case Token.XMLATTR /* 161 */:
            case Token.XMLEND /* 162 */:
            case Token.TO_OBJECT /* 163 */:
            case Token.TO_DOUBLE /* 164 */:
            case Token.GET /* 165 */:
            case Token.SET /* 166 */:
            case Token.WITHEXPR /* 173 */:
            case Token.COMMENT /* 175 */:
                return -2;
            case Token.SUPER /* 79 */:
            case Token.EXP /* 81 */:
            case Token.ESCXMLATTR /* 83 */:
            case Token.ESCXMLTEXT /* 84 */:
            case Token.REF_MEMBER /* 85 */:
            case Token.REF_NS_MEMBER /* 86 */:
            case Token.EXPR_RESULT /* 148 */:
            case Token.TYPEOFNAME /* 151 */:
            case Token.USE_STACK /* 152 */:
                return -3;
            case Token.STRICT_SETNAME /* 80 */:
            case Token.DEFAULTNAMESPACE /* 82 */:
                return -4;
            default:
                vs.m(a82.j(i, "Bad opcode: "));
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(defpackage.fi1 r10) {
        /*
            int r0 = r10.o
            int[] r0 = new int[r0]
            ai1 r1 = r10.l
            short r2 = r1.e
            r2 = r2 & 8
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L26
            java.lang.String r2 = "<init>"
            java.lang.String r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1d
            r1 = 6
            r0[r4] = r1
        L1b:
            r1 = r3
            goto L27
        L1d:
            int r1 = r10.t
            int r1 = defpackage.bbe.h(r1)
            r0[r4] = r1
            goto L1b
        L26:
            r1 = r4
        L27:
            ai1 r2 = r10.l
            java.lang.String r2 = r2.b
            r5 = 40
            int r5 = r2.indexOf(r5)
            r6 = 41
            int r6 = r2.indexOf(r6)
            if (r5 != 0) goto La7
            if (r6 < 0) goto La7
            int r5 = r5 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L41:
            if (r5 >= r6) goto La6
            char r8 = r2.charAt(r5)
            r9 = 70
            if (r8 == r9) goto L7d
            r9 = 76
            if (r8 == r9) goto L6d
            r9 = 83
            if (r8 == r9) goto L7d
            r9 = 73
            if (r8 == r9) goto L7d
            r9 = 74
            if (r8 == r9) goto L7d
            r9 = 90
            if (r8 == r9) goto L7d
            r9 = 91
            if (r8 == r9) goto L67
            switch(r8) {
                case 66: goto L7d;
                case 67: goto L7d;
                case 68: goto L7d;
                default: goto L66;
            }
        L66:
            goto L86
        L67:
            r7.append(r9)
            int r5 = r5 + 1
            goto L41
        L6d:
            r8 = 59
            int r8 = r2.indexOf(r8, r5)
            int r8 = r8 + r3
            java.lang.String r5 = r2.substring(r5, r8)
            r7.append(r5)
            r5 = r8
            goto L86
        L7d:
            char r8 = r2.charAt(r5)
            r7.append(r8)
            int r5 = r5 + 1
        L86:
            java.lang.String r8 = r7.toString()
            java.lang.String r8 = B(r8)
            h02 r9 = r10.k
            int r8 = defpackage.bbe.q(r8, r9)
            int r9 = r1 + 1
            r0[r1] = r8
            boolean r8 = defpackage.bbe.s(r8)
            if (r8 == 0) goto La1
            int r1 = r1 + 2
            goto La2
        La1:
            r1 = r9
        La2:
            r7.setLength(r4)
            goto L41
        La6:
            return r0
        La7:
            java.lang.String r10 = "bad method type"
            defpackage.vs.m(r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.a(fi1):int[]");
    }

    public final int C(int i) {
        if (i < 0) {
            int i2 = i & Integer.MAX_VALUE;
            if (i2 < this.x) {
                return this.w[i2];
            }
            vs.m("Bad label");
            return 0;
        }
        vs.m("Bad label, no biscuit");
        return 0;
    }

    public final void D(int i) {
        if (i < 0) {
            int i2 = i & Integer.MAX_VALUE;
            if (i2 <= this.x) {
                int[] iArr = this.w;
                if (iArr[i2] == -1) {
                    iArr[i2] = this.j;
                    return;
                } else {
                    vs.k("Can only mark label once");
                    return;
                }
            }
            vs.m("Bad label");
            return;
        }
        vs.m("Bad label, no biscuit");
    }

    public final void E(int i, int i2) {
        D(i);
        this.m = i2;
    }

    public final void F(int i, int i2) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, i2, this.j);
    }

    public final void G(int i, int i2, int i3) {
        if (i3 >= 0 && i3 <= this.n) {
            this.m = (short) i3;
            v(this.j);
            this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
            K(i, i2, this.j);
            return;
        }
        vs.m(a82.j(i3, "Bad stack index: "));
    }

    public final void H(int i) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, -1, this.j);
    }

    public final void K(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i3 >= 0 && (i4 = this.j) >= i3) {
            if (i2 >= -1) {
                int i6 = (~i) & 3;
                if (i2 < 0) {
                    i5 = i + 1 + i6;
                } else {
                    i5 = i + 1 + i6 + ((i2 + 3) * 4);
                }
                if (i >= 0 && ((i4 - 16) - i6) - 1 >= i) {
                    byte[] bArr = this.i;
                    if ((bArr[i] & 255) == 170) {
                        if (i5 >= 0 && i4 >= i5 + 4) {
                            J(bArr, i3 - i, i5);
                            return;
                        }
                        throw new RuntimeException(a82.j(i2, "Too big case index: "));
                    }
                    throw new IllegalArgumentException(i + " is not offset of tableswitch statement");
                }
                throw new IllegalArgumentException(i + " is outside a possible range of tableswitch in already generated code");
            }
            vs.m(a82.j(i2, "Bad case index: "));
            return;
        }
        vs.m(a82.j(i3, "Bad jump target: "));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ai1, java.lang.Object] */
    public final void N(String str, String str2, short s) {
        h02 h02Var = this.k;
        short i = h02Var.i(str);
        short i2 = h02Var.i(str2);
        ?? obj = new Object();
        obj.a = str;
        obj.c = i;
        obj.b = str2;
        obj.d = i2;
        obj.e = s;
        this.l = obj;
        this.c = new HashMap();
        this.p.add(this.l);
        v(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0480  */
    /* JADX WARN: Type inference failed for: r12v12, types: [y8b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r20) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.O(int):void");
    }

    public final byte[] P() {
        short s;
        int i;
        short s2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.B;
        h02 h02Var = this.k;
        if (arrayList3 != null) {
            s = h02Var.i("BootstrapMethods");
            i = 1;
        } else {
            s = 0;
            i = 0;
        }
        int i2 = this.v;
        if (i2 != 0) {
            i++;
            s2 = h02Var.i("SourceFile");
        } else {
            s2 = 0;
        }
        if (i2 != 0) {
            h02Var.i("SourceFile");
        }
        ArrayList arrayList4 = this.r;
        int size = (arrayList4.size() * 2) + h02Var.h + 18 + 2;
        int i3 = 0;
        while (true) {
            arrayList = this.q;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((zh1) arrayList.get(i3)).getClass();
            size += 8;
            i3++;
        }
        int i4 = size + 2;
        int i5 = 0;
        while (true) {
            arrayList2 = this.p;
            if (i5 >= arrayList2.size()) {
                break;
            }
            i4 += ((ai1) arrayList2.get(i5)).f.length + 8;
            i5++;
        }
        int i6 = i4 + 2;
        if (i2 != 0) {
            i6 = i4 + 10;
        }
        if (this.B != null) {
            i6 = i6 + 8 + this.C;
        }
        byte[] bArr = new byte[i6];
        int I = I(bArr, (short) h02Var.i, I(bArr, E, I(bArr, F, J(bArr, -889275714, 0))));
        System.arraycopy(h02Var.l, 0, bArr, I, h02Var.h);
        int I2 = I(bArr, arrayList4.size(), I(bArr, this.u, I(bArr, this.t, I(bArr, this.s, I + h02Var.h))));
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            I2 = I(bArr, ((Short) arrayList4.get(i7)).shortValue(), I2);
        }
        int I3 = I(bArr, arrayList.size(), I2);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            zh1 zh1Var = (zh1) arrayList.get(i8);
            I3 = I(bArr, 0, I(bArr, zh1Var.b, I(bArr, zh1Var.a, I(bArr, zh1Var.c, I3))));
        }
        int I4 = I(bArr, arrayList2.size(), I3);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            ai1 ai1Var = (ai1) arrayList2.get(i9);
            int I5 = I(bArr, 1, I(bArr, ai1Var.d, I(bArr, ai1Var.c, I(bArr, ai1Var.e, I4))));
            byte[] bArr2 = ai1Var.f;
            System.arraycopy(bArr2, 0, bArr, I5, bArr2.length);
            I4 = I5 + ai1Var.f.length;
        }
        int I6 = I(bArr, i, I4);
        if (this.B != null) {
            I6 = I(bArr, this.B.size(), J(bArr, this.C + 2, I(bArr, s, I6)));
            for (int i10 = 0; i10 < this.B.size(); i10++) {
                bi1 bi1Var = (bi1) this.B.get(i10);
                byte[] bArr3 = bi1Var.a;
                System.arraycopy(bArr3, 0, bArr, I6, bArr3.length);
                I6 += bi1Var.a.length;
            }
        }
        if (i2 != 0) {
            I6 = I(bArr, i2, J(bArr, 2, I(bArr, s2, I6)));
        }
        if (I6 == i6) {
            return bArr;
        }
        throw new RuntimeException();
    }

    public final void Q(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        d(i2, i3);
                        return;
                    } else {
                        c(i + 3);
                        return;
                    }
                }
                c(i + 2);
                return;
            }
            c(i + 1);
            return;
        }
        c(i);
    }

    public final int b() {
        int i = this.x;
        int[] iArr = this.w;
        if (iArr == null || i == iArr.length) {
            if (iArr == null) {
                this.w = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                this.w = iArr2;
            }
        }
        this.x = i + 1;
        this.w[i] = -1;
        return Integer.MIN_VALUE | i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r4) {
        /*
            r3 = this;
            r0 = 254(0xfe, float:3.56E-43)
            if (r4 == r0) goto L1e
            r0 = 255(0xff, float:3.57E-43)
            if (r4 == r0) goto L1e
            switch(r4) {
                case 0: goto L1e;
                case 1: goto L1e;
                case 2: goto L1e;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L1e;
                case 6: goto L1e;
                case 7: goto L1e;
                case 8: goto L1e;
                case 9: goto L1e;
                case 10: goto L1e;
                case 11: goto L1e;
                case 12: goto L1e;
                case 13: goto L1e;
                case 14: goto L1e;
                case 15: goto L1e;
                case 16: goto L18;
                case 17: goto L18;
                case 18: goto L18;
                case 19: goto L18;
                case 20: goto L18;
                case 21: goto L18;
                case 22: goto L18;
                case 23: goto L18;
                case 24: goto L18;
                case 25: goto L18;
                case 26: goto L1e;
                case 27: goto L1e;
                case 28: goto L1e;
                case 29: goto L1e;
                case 30: goto L1e;
                case 31: goto L1e;
                case 32: goto L1e;
                case 33: goto L1e;
                case 34: goto L1e;
                case 35: goto L1e;
                case 36: goto L1e;
                case 37: goto L1e;
                case 38: goto L1e;
                case 39: goto L1e;
                case 40: goto L1e;
                case 41: goto L1e;
                case 42: goto L1e;
                case 43: goto L1e;
                case 44: goto L1e;
                case 45: goto L1e;
                case 46: goto L1e;
                case 47: goto L1e;
                case 48: goto L1e;
                case 49: goto L1e;
                case 50: goto L1e;
                case 51: goto L1e;
                case 52: goto L1e;
                case 53: goto L1e;
                case 54: goto L18;
                case 55: goto L18;
                case 56: goto L18;
                case 57: goto L18;
                case 58: goto L18;
                case 59: goto L1e;
                case 60: goto L1e;
                case 61: goto L1e;
                case 62: goto L1e;
                case 63: goto L1e;
                case 64: goto L1e;
                case 65: goto L1e;
                case 66: goto L1e;
                case 67: goto L1e;
                case 68: goto L1e;
                case 69: goto L1e;
                case 70: goto L1e;
                case 71: goto L1e;
                case 72: goto L1e;
                case 73: goto L1e;
                case 74: goto L1e;
                case 75: goto L1e;
                case 76: goto L1e;
                case 77: goto L1e;
                case 78: goto L1e;
                case 79: goto L1e;
                case 80: goto L1e;
                case 81: goto L1e;
                case 82: goto L1e;
                case 83: goto L1e;
                case 84: goto L1e;
                case 85: goto L1e;
                case 86: goto L1e;
                case 87: goto L1e;
                case 88: goto L1e;
                case 89: goto L1e;
                case 90: goto L1e;
                case 91: goto L1e;
                case 92: goto L1e;
                case 93: goto L1e;
                case 94: goto L1e;
                case 95: goto L1e;
                case 96: goto L1e;
                case 97: goto L1e;
                case 98: goto L1e;
                case 99: goto L1e;
                case 100: goto L1e;
                case 101: goto L1e;
                case 102: goto L1e;
                case 103: goto L1e;
                case 104: goto L1e;
                case 105: goto L1e;
                case 106: goto L1e;
                case 107: goto L1e;
                case 108: goto L1e;
                case 109: goto L1e;
                case 110: goto L1e;
                case 111: goto L1e;
                case 112: goto L1e;
                case 113: goto L1e;
                case 114: goto L1e;
                case 115: goto L1e;
                case 116: goto L1e;
                case 117: goto L1e;
                case 118: goto L1e;
                case 119: goto L1e;
                case 120: goto L1e;
                case 121: goto L1e;
                case 122: goto L1e;
                case 123: goto L1e;
                case 124: goto L1e;
                case 125: goto L1e;
                case 126: goto L1e;
                case 127: goto L1e;
                case 128: goto L1e;
                case 129: goto L1e;
                case 130: goto L1e;
                case 131: goto L1e;
                case 132: goto L18;
                case 133: goto L1e;
                case 134: goto L1e;
                case 135: goto L1e;
                case 136: goto L1e;
                case 137: goto L1e;
                case 138: goto L1e;
                case 139: goto L1e;
                case 140: goto L1e;
                case 141: goto L1e;
                case 142: goto L1e;
                case 143: goto L1e;
                case 144: goto L1e;
                case 145: goto L1e;
                case 146: goto L1e;
                case 147: goto L1e;
                case 148: goto L1e;
                case 149: goto L1e;
                case 150: goto L1e;
                case 151: goto L1e;
                case 152: goto L1e;
                case 153: goto L18;
                case 154: goto L18;
                case 155: goto L18;
                case 156: goto L18;
                case 157: goto L18;
                case 158: goto L18;
                case 159: goto L18;
                case 160: goto L18;
                case 161: goto L18;
                case 162: goto L18;
                case 163: goto L18;
                case 164: goto L18;
                case 165: goto L18;
                case 166: goto L18;
                case 167: goto L18;
                case 168: goto L18;
                case 169: goto L18;
                case 170: goto L18;
                case 171: goto L18;
                case 172: goto L1e;
                case 173: goto L1e;
                case 174: goto L1e;
                case 175: goto L1e;
                case 176: goto L1e;
                case 177: goto L1e;
                case 178: goto L18;
                case 179: goto L18;
                case 180: goto L18;
                case 181: goto L18;
                case 182: goto L18;
                case 183: goto L18;
                case 184: goto L18;
                case 185: goto L18;
                default: goto Lb;
            }
        Lb:
            switch(r4) {
                case 187: goto L18;
                case 188: goto L18;
                case 189: goto L18;
                case 190: goto L1e;
                case 191: goto L1e;
                case 192: goto L18;
                case 193: goto L18;
                case 194: goto L1e;
                case 195: goto L1e;
                case 196: goto L1e;
                case 197: goto L18;
                case 198: goto L18;
                case 199: goto L18;
                case 200: goto L18;
                case 201: goto L18;
                case 202: goto L1e;
                default: goto Le;
            }
        Le:
            java.lang.String r3 = "Bad opcode: "
            java.lang.String r3 = defpackage.a82.j(r4, r3)
            defpackage.vs.m(r3)
            return
        L18:
            java.lang.String r3 = "Unexpected operands"
            defpackage.vs.m(r3)
            return
        L1e:
            int r0 = r3.m
            int r1 = M(r4)
            int r1 = r1 + r0
            if (r1 < 0) goto L41
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r0 < r1) goto L41
            r3.x(r4)
            short r0 = (short) r1
            r3.m = r0
            int r2 = r3.n
            if (r1 <= r2) goto L37
            r3.n = r0
        L37:
            r0 = 191(0xbf, float:2.68E-43)
            if (r4 != r0) goto L40
            int r4 = r3.j
            r3.v(r4)
        L40:
            return
        L41:
            A(r1)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.c(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi1.d(int, int):void");
    }

    public final void e(int i, String str) {
        int M = M(i) + this.m;
        if (M >= 0 && 32767 >= M) {
            if (i != 187 && i != 189 && i != 192 && i != 193) {
                vs.m("bad opcode for class reference");
                return;
            }
            short a = this.k.a(str);
            x(i);
            y(a);
            short s = (short) M;
            this.m = s;
            if (M > this.n) {
                this.n = s;
                return;
            }
            return;
        }
        A(M);
        throw null;
    }

    public final void f(String str, String str2, int i, String str3) {
        int i2;
        int i3;
        int M = M(i) + this.m;
        char charAt = str3.charAt(0);
        if (charAt != 'J' && charAt != 'D') {
            i2 = 1;
        } else {
            i2 = 2;
        }
        switch (i) {
            case Token.ARROW /* 178 */:
            case 180:
                i3 = M + i2;
                break;
            case Token.YIELD_STAR /* 179 */:
            case Token.TEMPLATE_CHARS /* 181 */:
                i3 = M - i2;
                break;
            default:
                vs.m("bad opcode for field reference");
                return;
        }
        if (i3 >= 0 && 32767 >= i3) {
            h02 h02Var = this.k;
            h02Var.getClass();
            cc4 cc4Var = new cc4(str, str2, str3);
            HashMap hashMap = h02Var.d;
            int intValue = ((Integer) hashMap.getOrDefault(cc4Var, -1)).intValue();
            if (intValue == -1) {
                short h = h02Var.h(str2, str3);
                short a = h02Var.a(str);
                h02Var.j(5);
                byte[] bArr = h02Var.l;
                int i4 = h02Var.h;
                int i5 = i4 + 1;
                h02Var.h = i5;
                bArr[i4] = 9;
                int I = I(bArr, a, i5);
                h02Var.h = I;
                h02Var.h = I(h02Var.l, h, I);
                intValue = h02Var.i;
                h02Var.i = intValue + 1;
                hashMap.put(cc4Var, Integer.valueOf(intValue));
            }
            h02Var.m(intValue, cc4Var);
            h02Var.k.put(Integer.valueOf(intValue), (byte) 9);
            x(i);
            y((short) intValue);
            short s = (short) i3;
            this.m = s;
            if (i3 > this.n) {
                this.n = s;
                return;
            }
            return;
        }
        A(i3);
        throw null;
    }

    public final void g(int i) {
        Q(42, 25, i);
    }

    public final void h(int i) {
        Q(75, 58, i);
    }

    public final void i(int i) {
        Q(38, 24, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [ky3, java.lang.Object] */
    public final void j(int i, String str, int i2, int i3) {
        short a;
        if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            if ((i2 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    if (str == null) {
                        a = 0;
                    } else {
                        a = this.k.a(str);
                    }
                    ?? obj = new Object();
                    obj.a = i;
                    obj.b = i2;
                    obj.c = i3;
                    obj.d = a;
                    int i4 = this.f;
                    if (i4 == 0) {
                        this.e = new ky3[4];
                    } else {
                        ky3[] ky3VarArr = this.e;
                        if (i4 == ky3VarArr.length) {
                            ky3[] ky3VarArr2 = new ky3[i4 * 2];
                            System.arraycopy(ky3VarArr, 0, ky3VarArr2, 0, i4);
                            this.e = ky3VarArr2;
                        }
                    }
                    this.e[i4] = obj;
                    this.f = i4 + 1;
                    return;
                }
                vs.m("Bad handlerLabel");
                return;
            }
            vs.m("Bad endLabel");
            return;
        }
        vs.m("Bad startLabel");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zh1, java.lang.Object] */
    public final void k(String str, String str2, short s) {
        h02 h02Var = this.k;
        short i = h02Var.i(str);
        short i2 = h02Var.i(str2);
        ?? obj = new Object();
        obj.a = i;
        obj.b = i2;
        obj.c = s;
        this.q.add(obj);
    }

    public final void l(int i) {
        Q(26, 21, i);
    }

    public final void m(String str, String str2, int i, String str3) {
        int L = L(str3);
        int i2 = L >>> 16;
        int M = M(i) + this.m + ((short) L);
        if (M >= 0 && 32767 >= M) {
            switch (i) {
                case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
                case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
                case Token.DOTDOTDOT /* 184 */:
                case 185:
                    x(i);
                    h02 h02Var = this.k;
                    if (i == 185) {
                        short h = h02Var.h(str2, str3);
                        short a = h02Var.a(str);
                        h02Var.j(5);
                        byte[] bArr = h02Var.l;
                        int i3 = h02Var.h;
                        int i4 = i3 + 1;
                        h02Var.h = i4;
                        bArr[i3] = 11;
                        int I = I(bArr, a, i4);
                        h02Var.h = I;
                        h02Var.h = I(h02Var.l, h, I);
                        h02Var.m(h02Var.i, new cc4(str, str2, str3));
                        h02Var.k.put(Integer.valueOf(h02Var.i), (byte) 11);
                        int i5 = h02Var.i;
                        h02Var.i = i5 + 1;
                        y((short) i5);
                        x(i2 + 1);
                        x(0);
                    } else {
                        y(h02Var.g(str, str2, str3));
                    }
                    short s = (short) M;
                    this.m = s;
                    if (M > this.n) {
                        this.n = s;
                        return;
                    }
                    return;
                default:
                    vs.m("bad opcode for method reference");
                    return;
            }
        }
        A(M);
        throw null;
    }

    public final void n(short s) {
        if (this.l != null) {
            int i = this.h;
            if (i == 0) {
                this.g = new int[16];
            } else {
                int[] iArr = this.g;
                if (i == iArr.length) {
                    int[] iArr2 = new int[i * 2];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    this.g = iArr2;
                }
            }
            this.g[i] = (this.j << 16) + s;
            this.h = i + 1;
            return;
        }
        vs.m("No method to stop");
    }

    public final void o(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                d(18, this.k.c(i));
                                return;
                            } else {
                                c(8);
                                return;
                            }
                        }
                        c(7);
                        return;
                    }
                    c(6);
                    return;
                }
                c(5);
                return;
            }
            c(4);
            return;
        }
        c(3);
    }

    public final void p() {
        c(42);
    }

    public final void q(double d) {
        if (d == 0.0d) {
            c(14);
            if (1.0d / d < 0.0d) {
                c(Token.INC);
            }
        } else if (d != 1.0d && d != -1.0d) {
            d(20, this.k.b(d));
        } else {
            c(15);
            if (d < 0.0d) {
                c(Token.INC);
            }
        }
    }

    public final void r(int i) {
        byte b = (byte) i;
        if (b == i) {
            if (i == -1) {
                c(2);
                return;
            } else if (i >= 0 && i <= 5) {
                c((byte) (i + 3));
                return;
            } else {
                d(16, b);
                return;
            }
        }
        short s = (short) i;
        if (s == i) {
            d(17, s);
        } else {
            o(i);
        }
    }

    public final void s(String str) {
        int length = str.length();
        h02 h02Var = this.k;
        h02Var.getClass();
        int i = 0;
        int l = h02.l(0, length, str);
        if (l == length) {
            d(18, h02Var.e(str));
            return;
        }
        e(Token.LAST_TOKEN, "java/lang/StringBuilder");
        c(89);
        r(length);
        m("java/lang/StringBuilder", "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(I)V");
        while (true) {
            c(89);
            d(18, h02Var.e(str.substring(i, l)));
            m("java/lang/StringBuilder", "append", Token.TEMPLATE_LITERAL_SUBST, "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            c(87);
            if (l == length) {
                m("java/lang/StringBuilder", "toString", Token.TEMPLATE_LITERAL_SUBST, "()Ljava/lang/String;");
                return;
            }
            int i2 = l;
            l = h02.l(l, length, str);
            i = i2;
        }
    }

    public final void t(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        c(i);
    }

    public final int u(int i) {
        if (this.l != null) {
            int i2 = this.j;
            int i3 = i + i2;
            byte[] bArr = this.i;
            if (i3 > bArr.length) {
                int length = bArr.length * 2;
                if (i3 > length) {
                    length = i3;
                }
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                this.i = bArr2;
            }
            this.j = i3;
            return i2;
        }
        vs.m("No method to add to");
        return 0;
    }

    public final void v(int i) {
        if (G) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[4];
            } else {
                int length = iArr.length;
                int i2 = this.b;
                if (length == i2) {
                    int[] iArr2 = new int[i2 * 2];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    this.a = iArr2;
                }
            }
            int[] iArr3 = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            iArr3[i3] = i;
        }
    }

    public final int w(int i, int i2) {
        byte[] bArr;
        if (i <= i2) {
            int M = M(170) + this.m;
            if (M >= 0 && 32767 >= M) {
                int i3 = (~this.j) & 3;
                int u = u((((i2 - i) + 4) * 4) + i3 + 1);
                int i4 = u + 1;
                this.i[u] = -86;
                while (true) {
                    bArr = this.i;
                    if (i3 == 0) {
                        break;
                    }
                    bArr[i4] = 0;
                    i3--;
                    i4++;
                }
                J(this.i, i2, J(bArr, i, i4 + 4));
                short s = (short) M;
                this.m = s;
                if (M > this.n) {
                    this.n = s;
                }
                return u;
            }
            A(M);
            throw null;
        }
        throw new RuntimeException(rs8.k("Bad bounds: ", i, i2, " "));
    }

    public final void x(int i) {
        this.i[u(1)] = (byte) i;
    }

    public final void y(int i) {
        I(this.i, i, u(2));
    }

    public final void z() {
        int i = this.m - 1;
        if (i >= 0 && 32767 >= i) {
            short s = (short) i;
            this.m = s;
            if (i > this.n) {
                this.n = s;
                return;
            }
            return;
        }
        A(i);
        throw null;
    }
}
