package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bvd  reason: default package */
/* loaded from: classes.dex */
public final class bvd extends ivd {
    public final nwd b;

    public bvd(nwd nwdVar) {
        super(1);
        this.b = nwdVar;
    }

    @Override // defpackage.ivd
    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ivd
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.g(new Status(10, nk2.v(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ivd
    public final void c(rwa rwaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        nwd nwdVar = this.b;
        ((Map) rwaVar.b).put(nwdVar, valueOf);
        nwdVar.a(new pvd(rwaVar, nwdVar));
    }

    @Override // defpackage.ivd
    public final void d(oud oudVar) {
        try {
            nwd nwdVar = this.b;
            qz4 qz4Var = oudVar.b;
            nwdVar.getClass();
            try {
                nwdVar.f(qz4Var);
            } catch (DeadObjectException e) {
                nwdVar.g(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                nwdVar.g(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
