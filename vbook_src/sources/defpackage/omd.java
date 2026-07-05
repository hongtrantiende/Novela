package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: omd  reason: default package */
/* loaded from: classes.dex */
public final class omd {
    public final r9a a;
    public final f82 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final p35 d = new p35(this, 2);

    public omd(ExecutorService executorService) {
        r9a r9aVar = new r9a(executorService, 0);
        this.a = r9aVar;
        this.b = zj0.e(r9aVar);
    }
}
