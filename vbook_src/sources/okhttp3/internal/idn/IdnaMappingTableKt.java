package okhttp3.internal.idn;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class IdnaMappingTableKt {
    public static final int a(int i, String str) {
        str.getClass();
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }
}
