package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w1f  reason: default package */
/* loaded from: classes.dex */
public final class w1f implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public w1f(w2f w2fVar, s0f s0fVar) {
        this.a = 0;
        this.b = s0fVar;
        Objects.requireNonNull(w2fVar);
        this.c = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                w2f w2fVar = (w2f) this.c;
                lne lneVar = w2fVar.d;
                lte lteVar = (lte) w2fVar.a;
                if (lneVar == null) {
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.f.e("Failed to send current screen to service");
                    return;
                }
                try {
                    s0f s0fVar = (s0f) this.b;
                    if (s0fVar == null) {
                        lneVar.l(0L, null, null, lteVar.a.getPackageName());
                    } else {
                        lneVar.l(s0fVar.c, s0fVar.a, s0fVar.b, lteVar.a.getPackageName());
                    }
                    w2fVar.k0();
                    return;
                } catch (RemoteException e) {
                    ppe ppeVar2 = ((lte) w2fVar.a).f;
                    lte.m(ppeVar2);
                    ppeVar2.f.f(e, "Failed to send current screen to the service");
                    return;
                }
            case 1:
                ((r2f) this.c).c.i0((ComponentName) this.b);
                return;
            case 2:
                r5f r5fVar = (r5f) this.b;
                int i = ((e8f) this.c).a;
                synchronized (r5fVar) {
                    SparseArray sparseArray = r5fVar.e;
                    e8f e8fVar = (e8f) sparseArray.get(i);
                    if (e8fVar != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("Timing out request: ");
                        sb.append(i);
                        Log.w("MessengerIpcClient", sb.toString());
                        sparseArray.remove(i);
                        e8fVar.c(new e60(27, "Timed out waiting for response", (Throwable) null));
                        r5fVar.d();
                    }
                }
                return;
            case 3:
                w2f w2fVar2 = ((r2f) this.c).c;
                w2fVar2.d = null;
                if (((jz1) this.b).b == 7777) {
                    if (w2fVar2.C == null) {
                        w2fVar2.C = Executors.newScheduledThreadPool(1);
                    }
                    w2fVar2.C.schedule(new og(this, 19), ((Long) yme.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                w2fVar2.m0();
                return;
            case 4:
                a6f a6fVar = (a6f) this.b;
                a6fVar.W();
                Runnable runnable = (Runnable) this.c;
                a6fVar.f().W();
                if (a6fVar.L == null) {
                    a6fVar.L = new ArrayList();
                }
                a6fVar.L.add(runnable);
                a6fVar.q();
                return;
            case 5:
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((e3f) ((Service) ((l97) this.b).a)).b((JobParameters) this.c);
                return;
            case 6:
                Context context = ((a0f) this.b).b;
                rm9 rm9Var = fje.E;
                if (rm9Var == null) {
                    synchronized (fje.D) {
                        rm9Var = fje.E;
                        if (rm9Var == null) {
                            kj a = rm9.a();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream open = assets.open(sb2.toString());
                                                try {
                                                    h0e h0eVar = h0e.a;
                                                    int i2 = kzd.a;
                                                    fje fjeVar = new fje(context, n6f.v(open, h0e.b));
                                                    a.v(fjeVar.b, fjeVar);
                                                    if (open != null) {
                                                        open.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (open != null) {
                                                        try {
                                                            open.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                    break;
                                                }
                                            } catch (i1e e2) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e2);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e3) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e3);
                            }
                            rm9Var = a.d(true);
                            fje.E = rm9Var;
                        }
                    }
                }
                String str2 = (String) this.c;
                if (!rm9Var.containsKey(str2)) {
                    StringBuilder sb4 = new StringBuilder(str2.length() + Token.WITHEXPR);
                    sb4.append("Config package ");
                    sb4.append(str2);
                    sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                    Log.e("FilePhenotypeFlags", sb4.toString());
                    return;
                }
                return;
            case 7:
                ((rf4) this.b).a((FirebaseAuth) this.c);
                return;
            case 8:
                o40 o40Var = (o40) this.b;
                AtomicReference atomicReference = (AtomicReference) o40Var.d;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) == null) {
                    z = true;
                }
                am8.v(z);
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    o40Var.n();
                    return;
                } catch (Throwable th3) {
                    try {
                        atomicReference.set(null);
                        o40Var.n();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                this.b = null;
                this.c = null;
                return;
        }
    }

    public /* synthetic */ w1f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ w1f(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public w1f(l97 l97Var, a6f a6fVar, Runnable runnable) {
        this.a = 4;
        this.b = a6fVar;
        this.c = runnable;
    }

    public /* synthetic */ w1f() {
        this.a = 9;
    }
}
