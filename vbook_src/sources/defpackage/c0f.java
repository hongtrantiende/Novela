package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c0f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c0f implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c0f(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, yv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [iye, tz4] */
    @Override // defpackage.c9b
    public final Object get() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Object obj = a0f.j;
                final ?? obj2 = new Object();
                obj2.a = context;
                context.getClass();
                if (((c9b) obj2.b) == null) {
                    obj2.b = a0f.m;
                }
                if (((c9b) obj2.c) == null) {
                    obj2.c = kte.j(new c0f((Context) obj2.a, 1));
                }
                if (((vze) obj2.d) == null) {
                    obj2.d = new c9b() { // from class: vze
                        @Override // defpackage.c9b
                        public final Object get() {
                            int i2 = r2;
                            yv yvVar = obj2;
                            switch (i2) {
                                case 0:
                                    Context context2 = (Context) yvVar.a;
                                    Object obj3 = a0f.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new d59(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return b0.a;
                                    }
                                default:
                                    return new d59(new i7f((c9b) yvVar.b));
                            }
                        }
                    };
                }
                if (((c9b) obj2.e) == null) {
                    ArrayList arrayList = new ArrayList();
                    f9f f9fVar = new f9f(new lv2((Context) obj2.a, 2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, f9fVar, new Object());
                    obj2.e = kte.j(new e0f(arrayList, 0));
                }
                if (((vze) obj2.f) == null) {
                    obj2.f = new c9b() { // from class: vze
                        @Override // defpackage.c9b
                        public final Object get() {
                            int i2 = r2;
                            yv yvVar = obj2;
                            switch (i2) {
                                case 0:
                                    Context context2 = (Context) yvVar.a;
                                    Object obj3 = a0f.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new d59(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return b0.a;
                                    }
                                default:
                                    return new d59(new i7f((c9b) yvVar.b));
                            }
                        }
                    };
                }
                return new a0f((Context) obj2.a, (c9b) obj2.b, (c9b) obj2.c, (vze) obj2.d, (c9b) obj2.e, (vze) obj2.f);
            case 1:
                Object obj3 = a0f.j;
                return new v1f(new tz4(this.b, null, gxe.a, xs.g, sz4.c));
            default:
                Object obj4 = t0f.a;
                return sze.s(context);
        }
    }
}
