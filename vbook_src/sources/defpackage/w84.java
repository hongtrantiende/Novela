package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w84  reason: default package */
/* loaded from: classes3.dex */
public abstract class w84 {
    public static final List a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, fa6] */
    static {
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            a = g9a.e0(g9a.b0(it));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
