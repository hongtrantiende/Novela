package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wye  reason: default package */
/* loaded from: classes.dex */
public final class wye extends qz4 {
    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof uye) {
            return (uye) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 4);
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return sxd.m;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 9410000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
