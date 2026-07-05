package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lv2  reason: default package */
/* loaded from: classes.dex */
public final class lv2 implements c47, bq3 {
    public final Context a;

    public lv2(Context context, int i) {
        boolean z;
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                return;
            case 2:
                new ConcurrentHashMap();
                if (context != null) {
                    z = true;
                } else {
                    z = false;
                }
                q1d.v(z, "Context cannot be null", new Object[0]);
                this.a = context.getApplicationContext();
                return;
            default:
                this.a = context;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ejf, java.lang.Object] */
    @Override // defpackage.c47
    public d47 a(yv yvVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int i2 = lc7.i(((vq4) yvVar.c).o);
            st0.l("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(a2d.G(i2)));
            q30 q30Var = new q30(i2, 0);
            q30 q30Var2 = new q30(i2, 1);
            ?? obj = new Object();
            obj.b = q30Var;
            obj.c = q30Var2;
            obj.a = true;
            obj.a = true;
            return obj.a(yvVar);
        }
        return new h88(5).a(yvVar);
    }

    @Override // defpackage.bq3
    public void b(axe axeVar) {
        py1 py1Var = new py1("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), py1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new bn(3, this, axeVar, threadPoolExecutor));
    }
}
