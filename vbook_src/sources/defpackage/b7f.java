package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b7f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b7f implements c10 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ b7f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [tu4, java.lang.Object] */
    @Override // defpackage.c10
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                g7f g7fVar = (g7f) this.b;
                Void r9 = (Void) obj;
                return ((v1f) g7fVar.d.get()).a(new rwa(g7fVar, (l7f) this.c));
            case 1:
                List list = (List) this.b;
                ldf ldfVar = (ldf) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    vbf vbfVar = new vbf(this, arrayList, size);
                    int i = khf.a;
                    b7f b7fVar = new b7f(4, kff.a(), vbfVar);
                    e73 e73Var = e73.a;
                    return dv4.f(dv4.e(dv4.f(dv4.d(ldfVar.a.e.H()), new b7f(4, kff.a(), new b7f(3, ldfVar, b7fVar)), e73Var), new Object(), e73Var), new b7f(4, kff.a(), new vbf(this, size, arrayList)), e73Var);
                }
                throw rs8.f(it);
            case 2:
                kn knVar = (kn) this.b;
                s3 s3Var = (s3) this.c;
                knVar.q((Uri) dv4.b((ListenableFuture) knVar.c), obj);
                synchronized (knVar.E) {
                    knVar.G = s3Var;
                }
                return dv4.c(obj);
            case 3:
                Void r92 = (Void) obj;
                return ((ldf) this.b).a.c.o((b7f) this.c, e73.a);
            default:
                sgf b = kff.b(kff.c(), (sgf) this.b);
                try {
                    ListenableFuture apply = ((c10) this.c).apply(obj);
                    if (apply != null) {
                        return apply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                c10 c10Var = (c10) this.c;
                StringBuilder sb = new StringBuilder(c10Var.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(c10Var);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
