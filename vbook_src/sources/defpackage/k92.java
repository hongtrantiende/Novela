package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k92  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k92 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k92(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                i92 i92Var = ((o92) obj).g;
                i92Var.getClass();
                ij1.n();
                s6f s6fVar = i92Var.c;
                oe4 oe4Var = (oe4) s6fVar.b;
                String str = (String) s6fVar.a;
                oe4Var.getClass();
                if (!new File((File) oe4Var.d, str).exists()) {
                    if (i92Var.e() == null || !i92Var.j.c()) {
                        z = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    oe4 oe4Var2 = (oe4) s6fVar.b;
                    oe4Var2.getClass();
                    new File((File) oe4Var2.d, str).delete();
                }
                return Boolean.valueOf(z);
            case 1:
                vp9 vp9Var = (vp9) obj;
                bx2 bx2Var = vp9Var.b;
                lj9 p = tl1.p(bx2Var);
                vp9Var.a.e(p);
                p.flush();
                if (!((AtomicBoolean) bx2Var.c).getAndSet(true)) {
                    try {
                        ((gca) ((Pair) ((ArrayBlockingQueue) bx2Var.b).take()).second).l(byc.b);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        fb4.k("Interrupted while waiting for a read to finish!");
                    }
                } else {
                    vs.k("Already closed");
                }
                return null;
            case 2:
                tc0 tc0Var = (tc0) ((s26) obj).c;
                zhe zheVar = (zhe) tc0Var.f;
                gea geaVar = (gea) tc0Var.b;
                String str2 = zheVar.b;
                ij1.p();
                try {
                    HashMap b = zhe.b(geaVar);
                    zg4 zg4Var = new zg4(str2, b);
                    zg4Var.Z("User-Agent", "Crashlytics Android SDK/20.0.6");
                    zg4Var.Z("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    zhe.a(zg4Var, geaVar);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, null);
                    }
                    String str3 = "Settings query params were: " + b;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return zheVar.c(zg4Var.L());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
