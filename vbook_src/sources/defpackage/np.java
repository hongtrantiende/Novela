package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: np  reason: default package */
/* loaded from: classes.dex */
public final class np extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public static final np b = new np(2, 0);
    public static final np c = new np(2, 1);
    public static final np d = new np(2, 2);
    public static final np e = new np(2, 3);
    public static final np f = new np(2, 4);
    public static final np C = new np(2, 5);
    public static final np D = new np(2, 6);
    public static final np E = new np(2, 7);
    public static final np F = new np(2, 8);
    public static final np G = new np(2, 9);
    public static final np H = new np(2, 10);
    public static final np I = new np(2, 11);
    public static final np J = new np(2, 12);
    public static final np K = new np(2, 13);
    public static final np L = new np(2, 14);
    public static final np M = new np(2, 15);
    public static final np N = new np(2, 16);
    public static final np O = new np(2, 17);
    public static final np P = new np(2, 18);
    public static final np Q = new np(2, 19);
    public static final np R = new np(2, 20);
    public static final np S = new np(2, 21);
    public static final np T = new np(2, 22);
    public static final np U = new np(2, 23);
    public static final np V = new np(2, 24);
    public static final np W = new np(2, 25);
    public static final np X = new np(2, 26);
    public static final np Y = new np(2, 27);
    public static final np Z = new np(2, 28);
    public static final np a0 = new np(2, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        mac macVar = null;
        int i2 = 1;
        boolean z = true;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                nq2.t((od6) obj).setResetBlock((xt4) obj2);
                return pvcVar;
            case 1:
                nq2.t((od6) obj).setUpdateBlock((xt4) obj2);
                return pvcVar;
            case 2:
                nq2.t((od6) obj).setReleaseBlock((xt4) obj2);
                return pvcVar;
            case 3:
                nq2.t((od6) obj).setUpdateBlock((xt4) obj2);
                return pvcVar;
            case 4:
                nq2.t((od6) obj).setReleaseBlock((xt4) obj2);
                return pvcVar;
            case 5:
                nq2.t((od6) obj).setModifier((nq7) obj2);
                return pvcVar;
            case 6:
                nq2.t((od6) obj).setDensity((r13) obj2);
                return pvcVar;
            case 7:
                nq2.t((od6) obj).setLifecycleOwner((un6) obj2);
                return pvcVar;
            case 8:
                nq2.t((od6) obj).setSavedStateRegistryOwner((ty9) obj2);
                return pvcVar;
            case 9:
                wcd t = nq2.t((od6) obj);
                int ordinal = ((tc6) obj2).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        xk5.o();
                        return null;
                    }
                } else {
                    i2 = 0;
                }
                t.setLayoutDirection(i2);
                return pvcVar;
            case 10:
                st3 st3Var = (st3) obj2;
                return Boolean.valueOf((((st3) obj) == st3Var && st3Var == st3.c) ? false : false);
            case 11:
                ((mp3) obj).c = (xy4) obj2;
                return pvcVar;
            case 12:
                ((mp3) obj).d = (cc) obj2;
                return pvcVar;
            case 13:
                ((np3) obj).c = (xy4) obj2;
                return pvcVar;
            case 14:
                ((np3) obj).e = ((ac) obj2).a;
                return pvcVar;
            case 15:
                ((np3) obj).d = ((bc) obj2).a;
                return pvcVar;
            case 16:
                String str = (String) obj;
                wy4 wy4Var = (wy4) obj2;
                if (str.length() == 0) {
                    return wy4Var.toString();
                }
                return str + ", " + wy4Var;
            case 17:
                String str2 = (String) obj;
                lq7 lq7Var = (lq7) obj2;
                if (str2.length() == 0) {
                    return lq7Var.toString();
                }
                return str2 + ", " + lq7Var;
            case 18:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (!rv4Var.U(intValue & 1, z2)) {
                    rv4Var.X();
                }
                return pvcVar;
            case 19:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (!rv4Var2.U(intValue2 & 1, z2)) {
                    rv4Var2.X();
                }
                return pvcVar;
            case 20:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (!rv4Var3.U(intValue3 & 1, z2)) {
                    rv4Var3.X();
                }
                return pvcVar;
            case 21:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                if (!rv4Var4.U(intValue4 & 1, z2)) {
                    rv4Var4.X();
                }
                return pvcVar;
            case 22:
                ((Number) obj2).intValue();
                ((od6) ((rw1) obj)).getClass();
                return pvcVar;
            case 23:
                ((od6) ((rw1) obj)).h0((b37) obj2);
                return pvcVar;
            case 24:
                ((od6) ((rw1) obj)).i0((nq7) obj2);
                return pvcVar;
            case 25:
                yx1 yx1Var = (yx1) obj2;
                od6 od6Var = (od6) ((rw1) obj);
                od6Var.Y = yx1Var;
                kn knVar = od6Var.c0;
                tza tzaVar = dy1.h;
                xt8 xt8Var = (xt8) yx1Var;
                xt8Var.getClass();
                od6Var.e0((r13) qye.m(xt8Var, tzaVar));
                xt8 xt8Var2 = (xt8) yx1Var;
                tc6 tc6Var = (tc6) qye.m(xt8Var2, dy1.n);
                if (od6Var.W != tc6Var) {
                    od6Var.W = tc6Var;
                    od6Var.G();
                    od6 v = od6Var.v();
                    if (v != null) {
                        v.D();
                    } else {
                        wg8 wg8Var = od6Var.K;
                        if (wg8Var != null) {
                            ((rg) wg8Var).invalidate();
                        }
                    }
                    od6Var.E();
                    for (mq7 mq7Var = (mq7) knVar.C; mq7Var != null; mq7Var = mq7Var.f) {
                        mq7Var.A0();
                    }
                }
                od6Var.j0((ucd) qye.m(xt8Var2, dy1.t));
                mq7 mq7Var2 = (mq7) knVar.C;
                if ((mq7Var2.d & 32768) != 0) {
                    while (mq7Var2 != null) {
                        if ((mq7Var2.c & 32768) != 0) {
                            mq7 mq7Var3 = mq7Var2;
                            gw7 gw7Var = null;
                            while (mq7Var3 != null) {
                                if (mq7Var3 instanceof wx1) {
                                    mq7 mq7Var4 = ((mq7) ((wx1) mq7Var3)).a;
                                    if (mq7Var4.J) {
                                        o38.c(mq7Var4);
                                    } else {
                                        mq7Var4.F = true;
                                    }
                                } else if ((mq7Var3.c & 32768) != 0 && (mq7Var3 instanceof m03)) {
                                    int i3 = 0;
                                    for (mq7 mq7Var5 = ((m03) mq7Var3).L; mq7Var5 != null; mq7Var5 = mq7Var5.f) {
                                        if ((mq7Var5.c & 32768) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                mq7Var3 = mq7Var5;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var3 != null) {
                                                    gw7Var.b(mq7Var3);
                                                    mq7Var3 = null;
                                                }
                                                gw7Var.b(mq7Var5);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mq7Var3 = voe.h(gw7Var);
                            }
                        }
                        if ((mq7Var2.d & 32768) != 0) {
                            mq7Var2 = mq7Var2.f;
                        }
                    }
                }
                return pvcVar;
            case 26:
                ((pp3) obj).b = (to5) obj2;
                return pvcVar;
            case 27:
                ((pp3) obj).a = (xy4) obj2;
                return pvcVar;
            case 28:
                ((pp3) obj).d = ((v22) obj2).a;
                return pvcVar;
            default:
                pp3 pp3Var = (pp3) obj;
                dm1 dm1Var = (dm1) obj2;
                if (dm1Var != null) {
                    macVar = dm1Var.a;
                }
                pp3Var.c = macVar;
                return pvcVar;
        }
    }
}
