package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a40  reason: default package */
/* loaded from: classes3.dex */
public final class a40 {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(a40.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
