package defpackage;

import android.content.Context;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z40  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z40 implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ z40(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s6f, java.lang.Object] */
    @Override // defpackage.c9b
    public final Object get() {
        ys2 ys2Var;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return h50.n(context);
            case 1:
                ?? obj = new Object();
                obj.a = context;
                obj.b = new lv2(context, 0);
                return obj;
            case 2:
                return new pv2(new s6f(context, new cw(2, (byte) 0)), new ut2());
            case 3:
                return new ly2(context);
            default:
                mm9 mm9Var = ys2.p;
                synchronized (ys2.class) {
                    try {
                        if (ys2.v == null) {
                            Context applicationContext = context.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            ys2.v = new ys2(applicationContext, hashMap);
                        }
                        ys2Var = ys2.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ys2Var;
        }
    }
}
