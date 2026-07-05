package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ppd  reason: default package */
/* loaded from: classes3.dex */
public abstract class ppd {
    public static final mt5 a = new mt5(null, null);
    public static final mfb b = new mfb(new u6d(13));

    public static final void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(hl5.o("Can not create a ", str, " from the given input: the field ", str, " is missing"));
    }
}
