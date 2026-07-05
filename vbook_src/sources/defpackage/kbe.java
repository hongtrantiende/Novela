package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kbe  reason: default package */
/* loaded from: classes.dex */
public final class kbe implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ kbe(int i) {
        this.a = i;
    }

    public static void a(yx4 yx4Var, Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        int i2 = yx4Var.a;
        uue.T(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = yx4Var.b;
        uue.T(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = yx4Var.c;
        uue.T(parcel, 3, 4);
        parcel.writeInt(i4);
        uue.P(parcel, 4, yx4Var.d);
        uue.K(parcel, 5, yx4Var.e);
        uue.R(parcel, 6, yx4Var.f, i);
        uue.H(parcel, 7, yx4Var.C);
        uue.O(parcel, 8, yx4Var.D, i);
        uue.R(parcel, 10, yx4Var.E, i);
        uue.R(parcel, 11, yx4Var.F, i);
        boolean z = yx4Var.G;
        uue.T(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = yx4Var.H;
        uue.T(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = yx4Var.I;
        uue.T(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uue.P(parcel, 15, yx4Var.J);
        uue.V(parcel, U);
    }

    public static void b(ibe ibeVar, Parcel parcel, int i) {
        String str = ibeVar.a;
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, str);
        uue.O(parcel, 3, ibeVar.b, i);
        uue.P(parcel, 4, ibeVar.c);
        long j = ibeVar.d;
        uue.T(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = ibeVar.e;
        uue.T(parcel, 6, 8);
        parcel.writeLong(j2);
        uue.V(parcel, U);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 718
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            Method dump skipped, instructions count: 2382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbe.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ibe[i];
            case 1:
                return new qbe[i];
            case 2:
                return new mt1[i];
            case 3:
                return new k70[i];
            case 4:
                return new Scope[i];
            case 5:
                return new j70[i];
            case 6:
                return new xge[i];
            case 7:
                return new ahe[i];
            case 8:
                return new hde[i];
            case 9:
                return new Status[i];
            case 10:
                return new l70[i];
            case 11:
                return new kp3[i];
            case 12:
                return new vke[i];
            case 13:
                return new ma4[i];
            case 14:
                return new fqe[i];
            case 15:
                return new m70[i];
            case 16:
                return new rve[i];
            case 17:
                return new wve[i];
            case 18:
                return new bwe[i];
            case 19:
                return new fwe[i];
            case 20:
                return new nwe[i];
            case 21:
                return new pwe[i];
            case 22:
                return new wwe[i];
            case 23:
                return new cxe[i];
            case 24:
                return new fve[i];
            case 25:
                return new n70[i];
            case 26:
                return new sz1[i];
            case 27:
                return new o70[i];
            case 28:
                return new yx4[i];
            default:
                return new p70[i];
        }
    }
}
