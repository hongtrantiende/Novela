package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n5f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n5f implements tu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n5f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tu4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((z5f) this.b).c)), (Throwable) obj);
                return null;
            case 1:
                o3f o3fVar = (o3f) obj;
                ydf ydfVar = r6f.a;
                String str = (String) this.b;
                f3f f3fVar = (f3f) o3fVar.t(str, g3f.u()).k();
                if (!Collections.unmodifiableList(((g3f) f3fVar.b).t()).contains("")) {
                    f3fVar.b();
                    ((g3f) f3fVar.b).v("");
                }
                l3f l3fVar = (l3f) o3fVar.k();
                f3fVar.b();
                ((g3f) f3fVar.b).w("");
                l3fVar.b();
                ((o3f) l3fVar.b).v().put(str, (g3f) f3fVar.d());
                return (o3f) l3fVar.d();
            default:
                n8f n8fVar = (n8f) this.b;
                d3f d3fVar = (d3f) obj;
                rwa rwaVar = new rwa(29, false);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (n8f.j) {
                            Uri uri = n8fVar.g;
                            bbf bbfVar = new bbf(d3fVar.t());
                            bbfVar.c = new rwa[]{rwaVar};
                            ((b9f) n8fVar.d.get()).a(uri, bbfVar);
                            n8fVar.h = d3fVar.t();
                        }
                        synchronized (n8f.k) {
                            Uri uri2 = n8fVar.i;
                            bbf bbfVar2 = new bbf(d3fVar.u());
                            bbfVar2.c = new rwa[]{rwaVar};
                            ((b9f) n8fVar.d.get()).a(uri2, bbfVar2);
                            d3fVar.u();
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
