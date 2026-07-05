package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gqd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gqd implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zl9 b;
    public final /* synthetic */ mj9 c;
    public final /* synthetic */ zl9 d;
    public final /* synthetic */ zl9 e;

    public /* synthetic */ gqd(mj9 mj9Var, zl9 zl9Var, zl9 zl9Var2, zl9 zl9Var3) {
        this.c = mj9Var;
        this.b = zl9Var;
        this.d = zl9Var2;
        this.e = zl9Var3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        zl9 zl9Var = this.e;
        zl9 zl9Var2 = this.d;
        mj9 mj9Var = this.c;
        zl9 zl9Var3 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    long j = 1;
                    if (longValue >= 1) {
                        byte readByte = mj9Var.readByte();
                        boolean z3 = false;
                        if ((readByte & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((readByte & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z3 = true;
                        }
                        if (z) {
                            j = 5;
                        }
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                zl9Var3.a = Integer.valueOf(mj9Var.q());
                            }
                            if (z2) {
                                zl9Var2.a = Integer.valueOf(mj9Var.q());
                            }
                            if (z3) {
                                zl9Var.a = Integer.valueOf(mj9Var.q());
                                return pvcVar;
                            }
                            return pvcVar;
                        }
                        fb4.k("bad zip: extended timestamp extra too short");
                    } else {
                        fb4.k("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return pvcVar;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (zl9Var3.a == null) {
                        if (longValue2 == 24) {
                            zl9Var3.a = Long.valueOf(mj9Var.C());
                            zl9Var2.a = Long.valueOf(mj9Var.C());
                            zl9Var.a = Long.valueOf(mj9Var.C());
                            return pvcVar;
                        }
                        fb4.k("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        fb4.k("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return pvcVar;
        }
    }

    public /* synthetic */ gqd(zl9 zl9Var, mj9 mj9Var, zl9 zl9Var2, zl9 zl9Var3) {
        this.b = zl9Var;
        this.c = mj9Var;
        this.d = zl9Var2;
        this.e = zl9Var3;
    }
}
