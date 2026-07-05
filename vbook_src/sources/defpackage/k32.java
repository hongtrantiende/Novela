package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzql;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k32  reason: default package */
/* loaded from: classes.dex */
public final class k32 {
    public Object a;
    public volatile Object b;

    public z5f a(final a0f a0fVar) {
        final x4f x4fVar = (x4f) this.b;
        x4f x4fVar2 = z5f.j;
        if (x4fVar != x4fVar2) {
            j23 j23Var = z5f.i;
            j23Var.getClass();
            final nt5 nt5Var = new nt5(8);
            nt5Var.b = false;
            ConcurrentHashMap concurrentHashMap = j23Var.a;
            Context context = a0fVar.b;
            String str = x4fVar.d;
            if (str == null) {
                str = (String) x4fVar.a.apply(context);
                x4fVar.d = str;
            }
            z4f z4fVar = (z4f) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: t5f
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    String str2 = (String) obj;
                    z4f z4fVar2 = new z4f(new z5f(a0f.this, x4fVar));
                    nt5Var.b = true;
                    return z4fVar2;
                }
            });
            if (nt5Var.b) {
                zzql.a(a0fVar.b, new bp9(j23Var, 21));
            }
            this.a = z4fVar.a;
            this.b = x4fVar2;
        }
        return (z5f) this.a;
    }
}
