package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: evd  reason: default package */
/* loaded from: classes.dex */
public final class evd extends tud {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public evd(mr6 mr6Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = mr6Var;
    }

    @Override // defpackage.ivd
    public final void a(Status status) {
        this.b.trySetException(new fv(status));
    }

    @Override // defpackage.ivd
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // defpackage.ivd
    public final /* bridge */ /* synthetic */ void c(rwa rwaVar, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.ivd
    public final void d(oud oudVar) {
        try {
            k(oudVar);
        } catch (DeadObjectException e) {
            a(ivd.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(ivd.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override // defpackage.tud
    public final mb4[] f(oud oudVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (mb4[]) ((wud) obj).a.c;
            default:
                wud wudVar = (wud) oudVar.f.get((mr6) obj);
                if (wudVar == null) {
                    return null;
                }
                return (mb4[]) wudVar.a.c;
        }
    }

    @Override // defpackage.tud
    public final boolean g(oud oudVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((wud) obj).a.a;
            default:
                wud wudVar = (wud) oudVar.f.get((mr6) obj);
                if (wudVar != null && wudVar.a.a) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.tud
    public final int h(oud oudVar) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                if (((wud) oudVar.f.get((mr6) this.d)) != null) {
                    return 0;
                }
                return -1;
        }
    }

    public final void k(oud oudVar) {
        switch (this.c) {
            case 0:
                wud wudVar = (wud) this.d;
                o40 o40Var = wudVar.a;
                ((jje) ((vz0) o40Var.d).b).accept(oudVar.b, this.b);
                mr6 mr6Var = (mr6) ((k32) o40Var.b).b;
                if (mr6Var != null) {
                    oudVar.f.put(mr6Var, wudVar);
                    return;
                }
                return;
            default:
                wud wudVar2 = (wud) oudVar.f.remove((mr6) this.d);
                if (wudVar2 != null) {
                    ((h88) ((vz0) wudVar2.b.b).c).accept(oudVar.b, this.b);
                    ((k32) wudVar2.a.b).b = null;
                    return;
                }
                this.b.trySetResult(Boolean.FALSE);
                return;
        }
    }

    public evd(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public evd(wud wudVar, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = wudVar;
    }

    private final /* bridge */ /* synthetic */ void i(rwa rwaVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(rwa rwaVar, boolean z) {
    }
}
