package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h82  reason: default package */
/* loaded from: classes3.dex */
public abstract class h82 {
    public static final List a;

    static {
        try {
            a = g9a.e0(g9a.b0(Arrays.asList(new yi()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
