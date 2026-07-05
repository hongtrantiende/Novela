package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zbc  reason: default package */
/* loaded from: classes.dex */
public abstract class zbc extends dcc {
    public final s26 d;
    public String e;
    public boolean f;
    public j40 g;
    public final s26 h;
    public final s26 i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc(acc accVar, unc uncVar) {
        super(accVar);
        uncVar.getClass();
        this.d = new s26(28, false);
        this.h = new s26(28, false);
        this.i = new s26(28, false);
    }

    public final void O(char c, int i, int i2) {
        this.h.j(c);
    }

    public final void P(char c, int i, int i2) {
        this.i.j(c);
    }

    public final void Q(int[] iArr, int i, int i2) {
        for (int i3 : iArr) {
            s26 s26Var = this.i;
            StringBuilder sb = (StringBuilder) s26Var.c;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) s26Var.b) != null) {
                s26Var.u();
                StringBuilder sb2 = (StringBuilder) s26Var.c;
                sb2.getClass();
                sb2.appendCodePoint(i3);
            } else {
                s26Var.b = new String(jqe.F(i3));
            }
        }
    }

    public final void R(String str) {
        int i;
        boolean z;
        str.getClass();
        String replace = str.replace((char) 0, (char) 65533);
        replace.getClass();
        s26 s26Var = this.d;
        s26Var.k(replace);
        String V = s26Var.V();
        int length = V.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (c16.l(V.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        this.e = tte.r(V.subSequence(i2, length + 1).toString());
    }

    public final boolean S(String str) {
        j40 j40Var = this.g;
        if (j40Var != null && j40Var.j(str)) {
            return true;
        }
        return false;
    }

    public final void T(String str) {
        int i;
        boolean z;
        str.getClass();
        s26 s26Var = this.d;
        s26Var.O();
        s26Var.b = str;
        String V = s26Var.V();
        int length = V.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (c16.l(V.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        this.e = tte.r(V.subSequence(i2, length + 1).toString());
    }

    public final void U() {
        String str;
        int i;
        boolean z;
        if (this.g == null) {
            this.g = new j40();
        }
        s26 s26Var = this.h;
        boolean A = s26Var.A();
        s26 s26Var2 = this.i;
        if (A) {
            j40 j40Var = this.g;
            j40Var.getClass();
            if (j40Var.size() < 512) {
                String V = s26Var.V();
                int length = V.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (c16.l(V.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj = V.subSequence(i2, length + 1).toString();
                if (obj.length() != 0) {
                    if (s26Var2.A()) {
                        str = s26Var2.V();
                    } else if (this.j) {
                        str = "";
                    } else {
                        str = null;
                    }
                    j40 j40Var2 = this.g;
                    j40Var2.getClass();
                    j40Var2.b(obj, str);
                }
            }
        }
        s26Var.O();
        s26Var2.O();
        this.j = false;
    }

    @Override // defpackage.dcc
    /* renamed from: V */
    public zbc f() {
        this.a = -1;
        this.b = -1;
        this.d.O();
        this.e = null;
        this.f = false;
        this.g = null;
        this.h.O();
        this.i.O();
        this.j = false;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String W() {
        /*
            r1 = this;
            java.lang.String r0 = r1.e
            if (r0 == 0) goto L10
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L1a
            java.lang.String r1 = r1.e
            if (r1 != 0) goto L19
            java.lang.String r1 = ""
        L19:
            return r1
        L1a:
            java.lang.String r1 = "Must be false"
            defpackage.cy7.i(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbc.W():java.lang.String");
    }

    public final String X() {
        String V = this.d.V();
        if (V.length() == 0) {
            return "[unset]";
        }
        return V;
    }
}
