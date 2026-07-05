package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d78  reason: default package */
/* loaded from: classes3.dex */
public abstract class d78 {
    public static final gm9 a = new gm9("(?<!\\d)(?<neg>[-–—])?(\\d+(?:,\\d+|(?:\\.\\d{3})+(?!\\d)|\\.\\d+|(?:\\s\\d{3})+(?!\\d))?)(?!\\d)");
    public static final gm9 b = new gm9("\\d+(?:\\s*[a-zA-Zμµ²³°]+\\d*)?(?:\\s*[x×]\\s*\\d+(?:\\s*[a-zA-Zμµ²³°]+\\d*)?)+", 0);
    public static final gm9 c = new gm9("(?<=\\d|[a-zA-Zμµ²³°])\\s*[x×]\\s*(?=\\d)", 0);
    public static final gm9 d = new gm9("(thứ|hạng)(\\s+)(\\d+)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 e = new gm9("((\\+84|84|0|0084)(3|5|7|8|9)[0-9]{8})");
    public static final gm9 f = new gm9("\\d+(\\.\\d{3})+");
}
