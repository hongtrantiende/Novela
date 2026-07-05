package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pcf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pcf implements c10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;

    public /* synthetic */ pcf(kn knVar, int i) {
        this.a = i;
        this.b = knVar;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.common.util.concurrent.ListenableFuture, x1, java.lang.Object] */
    @Override // defpackage.c10
    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        int i = this.a;
        kn knVar = this.b;
        switch (i) {
            case 0:
                synchronized (knVar.E) {
                    listenableFuture = (ListenableFuture) knVar.G;
                }
                return listenableFuture;
            case 1:
                Void r4 = (Void) obj;
                return dv4.c(knVar.p((Uri) dv4.b((ListenableFuture) knVar.c)));
            case 2:
                knVar.q((Uri) dv4.b((ListenableFuture) knVar.c), obj);
                return fs5.b;
            default:
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    b9f b9fVar = (b9f) knVar.f;
                    x8f b = b9fVar.b(build);
                    if (b.a.b(b.d)) {
                        x8f b2 = b9fVar.b(build);
                        x8f b3 = b9fVar.b(uri);
                        ebf ebfVar = b2.a;
                        if (ebfVar == b3.a) {
                            ebfVar.f(b2.d, b3.d);
                        } else {
                            throw new IOException("Cannot rename file across backends");
                        }
                    }
                    return fs5.b;
                } catch (IOException e) {
                    ?? obj2 = new Object();
                    obj2.m(e);
                    return obj2;
                }
        }
    }
}
