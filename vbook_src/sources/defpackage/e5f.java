package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e5f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e5f implements c10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c10
    public final ListenableFuture apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z5f z5fVar = (z5f) obj2;
                int i2 = ((r1f) obj).a;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !z5fVar.h.b()) {
                    z5fVar.b();
                }
                return fs5.b;
            case 1:
                q7f q7fVar = (q7f) obj2;
                q7fVar.getClass();
                pte pteVar = new pte(q7fVar, (v7f) obj);
                hr7 a = q7fVar.a.a();
                qoc qocVar = new qoc(pteVar);
                a.execute(qocVar);
                return qocVar;
            case 2:
                Void r2 = (Void) obj;
                return dv4.d((ListenableFuture) ((n8f) obj2).e.get());
            case 3:
                return dv4.c(((n5f) obj2).apply(obj));
            case 4:
                ldf ldfVar = (ldf) obj;
                return ((bcf) obj2).e.H();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
