package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dp4  reason: default package */
/* loaded from: classes.dex */
public final class dp4 implements bq3 {
    public ThreadPoolExecutor C;
    public axe D;
    public final Context a;
    public final cp4 b;
    public final lh9 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;

    public dp4(Context context, cp4 cp4Var) {
        jsc.w(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = cp4Var;
        this.c = ep4.d;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.D = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.C;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.C = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bq3
    public final void b(axe axeVar) {
        synchronized (this.d) {
            this.D = axeVar;
        }
        synchronized (this.d) {
            try {
                if (this.D == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new py1("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.C = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new x0(this, 23));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fq4 c() {
        try {
            lh9 lh9Var = this.c;
            Context context = this.a;
            cp4 cp4Var = this.b;
            lh9Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{cp4Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            qy2 a = wo4.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i == 0) {
                fq4[] fq4VarArr = (fq4[]) a.b.get(0);
                if (fq4VarArr != null && fq4VarArr.length != 0) {
                    return fq4VarArr[0];
                }
                cy7.e("fetchFonts failed (empty result)");
                return null;
            }
            cy7.e(hl5.l("fetchFonts failed (", ")", i));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            cp8.p("provider not found", e);
            return null;
        }
    }
}
