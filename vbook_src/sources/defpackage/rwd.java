package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rwd  reason: default package */
/* loaded from: classes.dex */
public final class rwd implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ rwd(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 636
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bk0[i];
            case 1:
                return new ck0[i];
            case 2:
                return new dk0[i];
            case 3:
                return new ek0[i];
            case 4:
                return new px9[i];
            case 5:
                return new qx9[i];
            case 6:
                return new vka[i];
            case 7:
                return new xka[i];
            case 8:
                return new SignInConfiguration[i];
            case 9:
                return new Transport[i];
            case 10:
                return new d40[i];
            case 11:
                return new nk1[i];
            case 12:
                return new jz1[i];
            case 13:
                return new pkf[i];
            case 14:
                return new ghf[i];
            case 15:
                return new fyd[i];
            case 16:
                return new skf[i];
            case 17:
                return new a0e[i];
            case 18:
                return new c15[i];
            case 19:
                return new x1e[i];
            case 20:
                return new f0e[i];
            case 21:
                return new nu9[i];
            case 22:
                return new t2e[i];
            case 23:
                return new p4e[i];
            case 24:
                return new i4e[i];
            case 25:
                return new y1e[i];
            case 26:
                return new s5e[i];
            case 27:
                return new u5e[i];
            case 28:
                return new m5e[i];
            default:
                return new iy4[i];
        }
    }
}
