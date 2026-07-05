package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: if5  reason: default package */
/* loaded from: classes3.dex */
public abstract class if5 {
    public static final t88 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            if (((gf5) g9a.c0(g9a.b0(it))) != null) {
                a = t88.a;
            } else {
                vs.k("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
