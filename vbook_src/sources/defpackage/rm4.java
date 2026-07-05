package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rm4  reason: default package */
/* loaded from: classes.dex */
public final class rm4 implements pm4 {
    public final rg a;
    public final rg b;
    public final mm4 d;
    public dv7 f;
    public hn4 h;
    public final hn4 c = new hn4(2, null, 14);
    public final qm4 e = new qm4(this);
    public final kv7 g = new kv7(1);

    public rm4(rg rgVar, rg rgVar2) {
        this.a = rgVar;
        this.b = rgVar2;
        this.d = new mm4(this, rgVar2);
    }

    public final boolean a(boolean z) {
        kn knVar;
        if (f() != null) {
            hn4 f = f();
            i(null);
            if (f != null) {
                dn4 dn4Var = dn4.a;
                dn4 dn4Var2 = dn4.c;
                f.I1(dn4Var, dn4Var2);
                if (!f.a.J) {
                    lv5.c("visitAncestors called on an unattached node");
                }
                mq7 mq7Var = f.a.e;
                od6 v = voe.v(f);
                while (v != null) {
                    if ((((mq7) v.c0.C).d & 1024) != 0) {
                        while (mq7Var != null) {
                            if ((mq7Var.c & 1024) != 0) {
                                mq7 mq7Var2 = mq7Var;
                                gw7 gw7Var = null;
                                while (mq7Var2 != null) {
                                    if (mq7Var2 instanceof hn4) {
                                        ((hn4) mq7Var2).I1(dn4.b, dn4Var2);
                                    } else if ((mq7Var2.c & 1024) != 0 && (mq7Var2 instanceof m03)) {
                                        int i = 0;
                                        for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                            if ((mq7Var3.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    mq7Var2 = mq7Var3;
                                                } else {
                                                    if (gw7Var == null) {
                                                        gw7Var = new gw7(new mq7[16], 0);
                                                    }
                                                    if (mq7Var2 != null) {
                                                        gw7Var.b(mq7Var2);
                                                        mq7Var2 = null;
                                                    }
                                                    gw7Var.b(mq7Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    mq7Var2 = voe.h(gw7Var);
                                }
                            }
                            mq7Var = mq7Var.e;
                        }
                    }
                    v = v.v();
                    if (v != null && (knVar = v.c0) != null) {
                        mq7Var = (hkb) knVar.f;
                    } else {
                        mq7Var = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int ordinal = cae.v(this.c, i).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    xk5.o();
                    return false;
                }
                z3 = false;
            } else {
                a(z);
            }
        } else {
            a(z);
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        rg rgVar = this.a;
        if (!rgVar.isFocused() && !rgVar.hasFocus()) {
            if (rgVar.hasFocus()) {
                View findFocus = rgVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                rgVar.clearFocus();
                return;
            }
            return;
        }
        rgVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
        if (r7 == null) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0198 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:10:0x0025, B:12:0x0029, B:13:0x0031, B:25:0x004d, B:28:0x0058, B:30:0x005e, B:31:0x0063, B:33:0x006b, B:35:0x0070, B:37:0x0076, B:41:0x007c, B:139:0x0198, B:141:0x019e, B:142:0x01a1, B:144:0x01ac, B:147:0x01ba, B:151:0x01c4, B:154:0x01ca, B:155:0x01cf, B:158:0x01d7, B:160:0x01dd, B:162:0x01e1, B:164:0x01e9, B:166:0x01ef, B:170:0x01f7, B:172:0x0200, B:173:0x0204, B:174:0x0207, B:177:0x020d, B:178:0x0212, B:179:0x0215, B:181:0x021b, B:183:0x021f, B:186:0x0228, B:188:0x0230, B:195:0x0247, B:197:0x024c, B:199:0x0250, B:222:0x0292, B:203:0x025c, B:205:0x0262, B:207:0x0266, B:209:0x026e, B:211:0x0274, B:215:0x027c, B:217:0x0285, B:218:0x0289, B:219:0x028c, B:223:0x0297, B:227:0x02a7, B:229:0x02ac, B:231:0x02b0, B:254:0x02f2, B:235:0x02bc, B:237:0x02c2, B:239:0x02c6, B:241:0x02ce, B:243:0x02d4, B:247:0x02dc, B:249:0x02e5, B:250:0x02e9, B:251:0x02ec, B:256:0x02f9, B:258:0x0300, B:45:0x0084, B:47:0x008a, B:48:0x008d, B:50:0x0095, B:53:0x00a3, B:57:0x00ad, B:88:0x0102, B:90:0x0106, B:60:0x00b2, B:62:0x00b8, B:64:0x00bc, B:66:0x00c4, B:68:0x00ca, B:72:0x00d2, B:74:0x00db, B:75:0x00df, B:76:0x00e2, B:79:0x00e8, B:80:0x00ed, B:81:0x00f0, B:83:0x00f6, B:85:0x00fa, B:91:0x010c, B:93:0x0112, B:94:0x0115, B:96:0x011f, B:99:0x012d, B:103:0x0137, B:134:0x018c, B:136:0x0190, B:106:0x013c, B:108:0x0142, B:110:0x0146, B:112:0x014e, B:114:0x0154, B:118:0x015c, B:120:0x0165, B:121:0x0169, B:122:0x016c, B:125:0x0172, B:126:0x0177, B:127:0x017a, B:129:0x0180, B:131:0x0184, B:15:0x0037, B:17:0x003b, B:19:0x0041, B:21:0x0045), top: B:268:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r13, defpackage.vt4 r14) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm4.d(android.view.KeyEvent, vt4):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x011e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r19, defpackage.rk9 r20, defpackage.xt4 r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm4.e(int, rk9, xt4):java.lang.Boolean");
    }

    public final hn4 f() {
        hn4 hn4Var = this.h;
        if (hn4Var != null && hn4Var.J) {
            return hn4Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zl9, java.lang.Object] */
    public final boolean g(int i, boolean z) {
        boolean z2;
        hn4 f = f();
        rg rgVar = this.a;
        if (f == null || !f.K || !rgVar.w(i)) {
            ?? obj = new Object();
            obj.a = Boolean.FALSE;
            hn4 f2 = f();
            Boolean e = e(i, rgVar.getEmbeddedViewFocusRect(), new b65(obj, i, 4));
            if (!c16.i(e, Boolean.TRUE) || f2 == f()) {
                if (e != null && obj.a != null) {
                    if (!e.booleanValue() || !((Boolean) obj.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean e2 = e(i, null, new ng(i, 3));
                            if (e2 != null) {
                                z2 = e2.booleanValue();
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i) {
        boolean z = false;
        if (!b(i, false, false)) {
            return false;
        }
        Boolean e = e(i, null, new ng(i, 2));
        if (e != null) {
            z = e.booleanValue();
        }
        if (!z) {
            c();
        }
        return z;
    }

    public final void i(hn4 hn4Var) {
        hn4 hn4Var2 = this.h;
        this.h = hn4Var;
        kv7 kv7Var = this.g;
        Object[] objArr = kv7Var.a;
        int i = kv7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((nm4) objArr[i2]).a(hn4Var2, hn4Var);
        }
    }
}
