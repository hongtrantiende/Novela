package defpackage;

import java.util.Comparator;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uoe  reason: default package */
/* loaded from: classes.dex */
public abstract class uoe {
    public static final Comparator a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(uoe.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = roe.a;
        }
        a = comparator;
    }
}
