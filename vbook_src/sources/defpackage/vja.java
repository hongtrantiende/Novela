package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vja  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vja extends xu4 implements vt4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vja(y5c y5cVar, int i) {
        super(0, 0, y5c.class, y5cVar, "cancelAnalyze", "cancelAnalyze()V");
        this.a = i;
        switch (i) {
            case 10:
                super(0, 0, y5c.class, y5cVar, "reAnalyzeNER", "reAnalyzeNER()V");
                return;
            case 11:
                super(0, 0, y5c.class, y5cVar, "saveNER", "saveNER()V");
                return;
            default:
                return;
        }
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        int i;
        Object value4;
        int i2;
        oaa oaaVar;
        rz rzVar;
        rz rzVar2;
        q65 q65Var;
        Object value5;
        phc phcVar;
        int i3;
        Object value6;
        phc phcVar2;
        boolean z;
        int i4;
        int i5 = this.a;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        switch (i5) {
            case 0:
                ((wja) this.receiver).l();
                return pvcVar;
            case 1:
                f0b f0bVar = (f0b) this.receiver;
                cza czaVar = f0bVar.e;
                c0b c0bVar = (c0b) czaVar.getValue();
                if (!c0bVar.i && c0bVar.h) {
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, c0b.a((c0b) value, 0, null, false, true, 0, null, false, false, 65279)));
                        hk1 a = jdd.a(f0bVar);
                        sw2 sw2Var = ab3.a;
                        f0bVar.f(a, ru2.c, new xh0(f0bVar, c0bVar, null, 2));
                    } else {
                        hk1 a2 = jdd.a(f0bVar);
                        sw2 sw2Var2 = ab3.a;
                        f0bVar.f(a2, ru2.c, new xh0(f0bVar, c0bVar, null, 2));
                    }
                }
                return pvcVar;
            case 2:
                f0b f0bVar2 = (f0b) this.receiver;
                cza czaVar2 = f0bVar2.e;
                c0b c0bVar2 = (c0b) czaVar2.getValue();
                if (!c0bVar2.p && c0bVar2.o) {
                    if (czaVar2 != null) {
                        do {
                            value2 = czaVar2.getValue();
                        } while (!czaVar2.l(value2, c0b.a((c0b) value2, 0, null, false, false, 0, null, false, true, 32767)));
                        hk1 a3 = jdd.a(f0bVar2);
                        sw2 sw2Var3 = ab3.a;
                        f0bVar2.f(a3, ru2.c, new of(c0bVar2, f0bVar2, (m42) null));
                    } else {
                        hk1 a32 = jdd.a(f0bVar2);
                        sw2 sw2Var32 = ab3.a;
                        f0bVar2.f(a32, ru2.c, new of(c0bVar2, f0bVar2, (m42) null));
                    }
                }
                return pvcVar;
            case 3:
                cza czaVar3 = ((f0b) this.receiver).C;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                        if (((Number) value3).intValue() == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while (!czaVar3.l(value3, Integer.valueOf(i)));
                    return pvcVar;
                }
                return pvcVar;
            case 4:
                cza czaVar4 = ((f0b) this.receiver).D;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                        if (((Number) value4).intValue() == 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                    } while (!czaVar4.l(value4, Integer.valueOf(i2)));
                    return pvcVar;
                }
                return pvcVar;
            case 5:
                web webVar = (web) this.receiver;
                webVar.getClass();
                hk1 a4 = jdd.a(webVar);
                sw2 sw2Var4 = ab3.a;
                webVar.f(a4, ru2.c, new seb(webVar, null, 1));
                return pvcVar;
            case 6:
                web webVar2 = (web) this.receiver;
                webVar2.getClass();
                hk1 a5 = jdd.a(webVar2);
                sw2 sw2Var5 = ab3.a;
                webVar2.f(a5, ru2.c, new ov9(webVar2, (m42) null, 11));
                return pvcVar;
            case 7:
                uo3 uo3Var = (uo3) this.receiver;
                if (!uo3Var.g) {
                    oaaVar = uo3Var.b;
                    rzVar = (rz) oaaVar.b;
                    rzVar2 = (rz) oaaVar.c;
                    q65Var = (q65) rzVar2.g();
                    if (q65Var != null) {
                        rzVar2.removeLast();
                        rzVar.addLast(q65Var);
                        try {
                            uo3Var.a(q65Var, p65.b);
                            oaaVar.R();
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 8:
                uo3 uo3Var2 = (uo3) this.receiver;
                if (!uo3Var2.g) {
                    oaaVar = uo3Var2.b;
                    rzVar = (rz) oaaVar.c;
                    rzVar2 = (rz) oaaVar.b;
                    q65Var = (q65) rzVar2.g();
                    if (q65Var != null) {
                        rzVar2.removeLast();
                        rzVar.addLast(q65Var);
                        try {
                            uo3Var2.a(q65Var, p65.a);
                            oaaVar.R();
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 9:
                ((y5c) this.receiver).U();
                return pvcVar;
            case 10:
                y5c y5cVar = (y5c) this.receiver;
                y5cVar.getClass();
                hk1 a6 = jdd.a(y5cVar);
                sw2 sw2Var6 = ab3.a;
                y5cVar.f(a6, ru2.c, new s4c(3, null, y5cVar));
                return pvcVar;
            case 11:
                y5c y5cVar2 = (y5c) this.receiver;
                y5cVar2.getClass();
                hk1 a7 = jdd.a(y5cVar2);
                sw2 sw2Var7 = ab3.a;
                y5cVar2.f(a7, ru2.c, new qkb(y5cVar2, (m42) null, 13));
                return pvcVar;
            case 12:
                cz7 cz7Var = (cz7) this.receiver;
                cz7Var.getClass();
                cz7Var.b(nca.INSTANCE);
                return pvcVar;
            case 13:
                shc shcVar = (shc) this.receiver;
                w43 w43Var = ((phc) shcVar.C.getValue()).g;
                if (w43Var != null && w43Var.f != 2) {
                    hk1 a8 = jdd.a(shcVar);
                    sw2 sw2Var8 = ab3.a;
                    shcVar.f(a8, ru2.c, new qhc(shcVar, w43Var, null, 0));
                }
                return pvcVar;
            case 14:
                shc shcVar2 = (shc) this.receiver;
                cza czaVar5 = shcVar2.C;
                w43 w43Var2 = ((phc) czaVar5.getValue()).g;
                if (w43Var2 != null && !shcVar2.I && shcVar2.H && !((phc) czaVar5.getValue()).a) {
                    iya iyaVar = shcVar2.J;
                    if (iyaVar != null) {
                        iyaVar.cancel(null);
                    }
                    hk1 a9 = jdd.a(shcVar2);
                    sw2 sw2Var9 = ab3.a;
                    shcVar2.J = z87.v(a9, ru2.c, null, new qhc(shcVar2, w43Var2, null, 1), 2);
                }
                return pvcVar;
            case 15:
                shc shcVar3 = (shc) this.receiver;
                cza czaVar6 = shcVar3.C;
                w43 w43Var3 = ((phc) czaVar6.getValue()).g;
                if (w43Var3 != null) {
                    if (w43Var3.f != 1) {
                        z2 = true;
                    }
                    if (czaVar6 != null) {
                        do {
                            value5 = czaVar6.getValue();
                            phcVar = (phc) value5;
                            if (z2) {
                                i3 = 1;
                            } else {
                                i3 = 4;
                            }
                        } while (!czaVar6.l(value5, phc.a(phcVar, false, false, false, false, false, false, w43.a(w43Var3, i3, 0, false, 0, 32735), null, null, null, 959)));
                        hk1 a10 = jdd.a(shcVar3);
                        sw2 sw2Var10 = ab3.a;
                        shcVar3.f(a10, ru2.c, new pz2(shcVar3, w43Var3, z2, (m42) null, 8));
                    } else {
                        hk1 a102 = jdd.a(shcVar3);
                        sw2 sw2Var102 = ab3.a;
                        shcVar3.f(a102, ru2.c, new pz2(shcVar3, w43Var3, z2, (m42) null, 8));
                    }
                }
                return pvcVar;
            case 16:
                ((shc) this.receiver).l();
                return pvcVar;
            case 17:
                ((shc) this.receiver).l();
                return pvcVar;
            case 18:
                shc shcVar4 = (shc) this.receiver;
                cza czaVar7 = shcVar4.C;
                w43 w43Var4 = ((phc) czaVar7.getValue()).g;
                if (w43Var4 != null) {
                    if (czaVar7 != null) {
                        do {
                            value6 = czaVar7.getValue();
                            phcVar2 = (phc) value6;
                            boolean z3 = w43Var4.i;
                            z = !z3;
                            int i6 = w43Var4.h;
                            if (z3) {
                                i4 = i6 - 1;
                            } else {
                                i4 = i6 + 1;
                            }
                        } while (!czaVar7.l(value6, phc.a(phcVar2, false, false, false, false, false, false, w43.a(w43Var4, 0, i4, z, 0, 32383), null, null, null, 959)));
                        hk1 a11 = jdd.a(shcVar4);
                        sw2 sw2Var11 = ab3.a;
                        shcVar4.f(a11, ru2.c, new q4c(shcVar4, w43Var4, null, 12));
                    } else {
                        hk1 a112 = jdd.a(shcVar4);
                        sw2 sw2Var112 = ab3.a;
                        shcVar4.f(a112, ru2.c, new q4c(shcVar4, w43Var4, null, 12));
                    }
                }
                return pvcVar;
            case 19:
                szc szcVar = (szc) this.receiver;
                szcVar.getClass();
                hk1 a12 = jdd.a(szcVar);
                sw2 sw2Var12 = ab3.a;
                szcVar.f(a12, ru2.c, new q4c(szcVar, (m42) null, 16));
                return pvcVar;
            case 20:
                ((ubd) this.receiver).q();
                return pvcVar;
            case 21:
                ubd ubdVar = (ubd) this.receiver;
                int i7 = ubdVar.O;
                if (i7 > 0) {
                    ubdVar.p(i7 - 1);
                }
                return pvcVar;
            case 22:
                ubd ubdVar2 = (ubd) this.receiver;
                ubdVar2.getClass();
                hk1 a13 = jdd.a(ubdVar2);
                sw2 sw2Var13 = ab3.a;
                ubdVar2.f(a13, ru2.c, new pbd(ubdVar2, null, 5));
                return pvcVar;
            case 23:
                ubd ubdVar3 = (ubd) this.receiver;
                if (((s6d) ubdVar3.R.getValue()).e) {
                    ubdVar3.q();
                }
                return pvcVar;
            default:
                ((cz7) this.receiver).c();
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vja(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}
