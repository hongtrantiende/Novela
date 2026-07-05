package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mh5  reason: default package */
/* loaded from: classes3.dex */
public abstract class mh5 {
    public static final h40 a;

    static {
        nsc nscVar;
        nsc nscVar2;
        nsc nscVar3;
        nsc nscVar4;
        nsc nscVar5;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        sw6.b("io.ktor.client.plugins.HttpRequestRetry");
        int i = lh5.a;
        gi1 a2 = cm9.a(jj1.class);
        nsc nscVar6 = null;
        try {
            w76 w76Var = w76.c;
            gi1 a3 = cm9.a(ij1.class);
            cm9.a.getClass();
            ksc kscVar = new ksc(a3);
            cm9.c(kscVar, cm9.d(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            nscVar = cm9.e(jj1.class, v9e.y(new nsc(kscVar, list, 0)));
        } catch (Throwable unused) {
            nscVar = null;
        }
        new h40("RetryFeature", new isc(a2, nscVar));
        gi1 a4 = cm9.a(Integer.class);
        try {
            nscVar2 = cm9.d(cls2);
        } catch (Throwable unused2) {
            nscVar2 = null;
        }
        a = new h40("MaxRetriesPerRequestAttributeKey", new isc(a4, nscVar2));
        gi1 a5 = cm9.a(mu4.class);
        try {
            w76 w76Var2 = w76.c;
            nscVar3 = cm9.f(mu4.class, v9e.y(cm9.d(xh5.class)), v9e.y(cm9.d(fh5.class)), v9e.y(cm9.d(oh5.class)), v9e.y(cm9.d(cls)));
        } catch (Throwable unused3) {
            nscVar3 = null;
        }
        new h40("ShouldRetryPerRequestAttributeKey", new isc(a5, nscVar3));
        gi1 a6 = cm9.a(mu4.class);
        try {
            w76 w76Var3 = w76.c;
            nscVar4 = cm9.f(mu4.class, v9e.y(cm9.d(xh5.class)), v9e.y(cm9.d(gh5.class)), v9e.y(cm9.d(Throwable.class)), v9e.y(cm9.d(cls)));
        } catch (Throwable unused4) {
            nscVar4 = null;
        }
        new h40("ShouldRetryOnExceptionPerRequestAttributeKey", new isc(a6, nscVar4));
        gi1 a7 = cm9.a(lu4.class);
        try {
            w76 w76Var4 = w76.c;
            nscVar5 = cm9.f(lu4.class, v9e.y(cm9.d(wh5.class)), v9e.y(cm9.d(gh5.class)), v9e.y(cm9.d(pvc.class)));
        } catch (Throwable unused5) {
            nscVar5 = null;
        }
        new h40("ModifyRequestPerRequestAttributeKey", new isc(a7, nscVar5));
        gi1 a8 = cm9.a(lu4.class);
        try {
            w76 w76Var5 = w76.c;
            nscVar6 = cm9.f(lu4.class, v9e.y(cm9.d(vh5.class)), v9e.y(cm9.d(cls2)), v9e.y(cm9.d(Long.TYPE)));
        } catch (Throwable unused6) {
        }
        new h40("RetryDelayPerRequestAttributeKey", new isc(a8, nscVar6));
    }
}
