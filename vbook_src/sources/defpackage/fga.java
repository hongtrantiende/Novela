package defpackage;

import androidx.datastore.core.NativeSharedCounter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fga  reason: default package */
/* loaded from: classes.dex */
public final class fga {
    public static final /* synthetic */ fga a = new Object();
    public static final NativeSharedCounter b;

    /* JADX WARN: Type inference failed for: r0v0, types: [fga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.datastore.core.NativeSharedCounter] */
    static {
        System.loadLibrary("datastore_shared_counter");
        b = new Object();
    }
}
