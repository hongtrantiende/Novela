package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ixe  reason: default package */
/* loaded from: classes.dex */
public final class ixe extends tbe {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ixe(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (this.a) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) wbe.a(parcel, Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                wbe.d(parcel);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                if (status.c()) {
                    try {
                        h0e h0eVar = h0e.a;
                        int i2 = kzd.a;
                        uue.E(status, d3f.v(createByteArray, h0e.b), taskCompletionSource);
                    } catch (i1e e) {
                        taskCompletionSource.setException(e);
                    }
                } else {
                    uue.E(status, null, taskCompletionSource);
                }
                return true;
            case 1:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                switch (i) {
                    case 1:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 2:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 3:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 4:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (wve) wbe.a(parcel, wve.CREATOR), taskCompletionSource2);
                        break;
                    case 5:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 6:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (fwe) wbe.a(parcel, fwe.CREATOR), taskCompletionSource2);
                        break;
                    case 7:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (bwe) wbe.a(parcel, bwe.CREATOR), taskCompletionSource2);
                        break;
                    case 8:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 9:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (nwe) wbe.a(parcel, nwe.CREATOR), taskCompletionSource2);
                        break;
                    case 10:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (wve) wbe.a(parcel, wve.CREATOR), taskCompletionSource2);
                        break;
                    case 11:
                        parcel.readLong();
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 12:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 13:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), (wwe) wbe.a(parcel, wwe.CREATOR), taskCompletionSource2);
                        break;
                    case 14:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 15:
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), null, taskCompletionSource2);
                        break;
                    case 16:
                        long readLong = parcel.readLong();
                        wbe.d(parcel);
                        uue.E((Status) wbe.a(parcel, Status.CREATOR), Long.valueOf(readLong), taskCompletionSource2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                wbe.d(parcel);
                ygd ygdVar = new ygd(this, createByteArray2);
                k32 k32Var = (k32) this.b;
                ((p35) k32Var.a).execute(new bv4(13, k32Var, ygdVar));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixe(iye iyeVar, k32 k32Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = k32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixe(iye iyeVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = taskCompletionSource;
    }
}
