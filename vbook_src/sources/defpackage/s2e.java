package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s2e  reason: default package */
/* loaded from: classes.dex */
public final class s2e extends RuntimeException {
    public s2e() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, i1e] */
    public final i1e a() {
        return new IOException(getMessage());
    }
}
