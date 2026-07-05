package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.reader.android.MainActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d89  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d89 implements swa, xo9, a6, h12, lfb, Continuation, g09, OnCompleteListener, k9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d89(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                jk jkVar = (jk) obj;
                synchronized (dra.c) {
                    dra.i = sl1.l0(dra.i, jkVar);
                }
                dra.a();
                return;
            default:
                lu4 lu4Var = (lu4) obj;
                synchronized (dra.c) {
                    dra.h = sl1.l0(dra.h, lu4Var);
                }
                return;
        }
    }

    @Override // defpackage.h12
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 7:
                d8b d8bVar = (d8b) obj2;
                wd2 wd2Var = (wd2) obj;
                c8b c8bVar = new c8b(wd2Var.b, p40.n(wd2Var.a, wd2Var.c));
                d8bVar.c.add(c8bVar);
                long j = d8bVar.j;
                if (j == -9223372036854775807L || wd2Var.d >= j) {
                    d8bVar.g(c8bVar);
                    return;
                }
                return;
            default:
                ((ls5) obj2).b((wd2) obj);
                return;
        }
    }

    public void b(fp6 fp6Var) {
        ep6 ep6Var;
        xt4 xt4Var = (xt4) this.b;
        fp6Var.getClass();
        if (fp6Var instanceof ep6) {
            ep6Var = (ep6) fp6Var;
        } else {
            ep6Var = null;
        }
        if (ep6Var != null) {
            xt4Var.invoke(ep6Var.a);
        }
    }

    @Override // defpackage.swa
    public boolean c() {
        return ((twa) ((uwa) ((MainActivity) this.b).R.getValue()).c.getValue()).a;
    }

    @Override // defpackage.k9b
    public l9b d(j9b j9bVar) {
        Context context = (Context) this.b;
        String str = (String) j9bVar.d;
        ny0 ny0Var = (ny0) j9bVar.e;
        ny0Var.getClass();
        if (str != null && str.length() != 0) {
            return new nt4(context, str, ny0Var, true, true);
        }
        vs.m("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        ((cza) ((bw7) this.b)).m(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [fw9, java.lang.Object] */
    @Override // defpackage.lfb
    public Object h() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 9:
                hw9 hw9Var = (hw9) ((tc0) obj).i;
                SQLiteDatabase o = hw9Var.o();
                o.beginTransaction();
                try {
                    o.compileStatement("DELETE FROM log_event_dropped").execute();
                    o.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hw9Var.b.h()).execute();
                    o.setTransactionSuccessful();
                    return null;
                } finally {
                    o.endTransaction();
                }
            default:
                odd oddVar = (odd) obj;
                for (ld0 ld0Var : (Iterable) ((hw9) oddVar.c).C(new Object())) {
                    ((zg4) oddVar.d).i0(ld0Var, 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.xo9
    public void i(long j, km8 km8Var) {
        int i = this.a;
        q5a q5aVar = (q5a) this.b;
        switch (i) {
            case 2:
                p1d.g(j, km8Var, q5aVar.c);
                return;
            default:
                p1d.h(j, km8Var, q5aVar.c);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                zr1.m((Intent) obj);
                return;
            case 14:
                ((kld) obj).b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }
}
