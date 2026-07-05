package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w28  reason: default package */
/* loaded from: classes3.dex */
public final class w28 extends UnsupportedOperationException {
    public final String a;

    public w28(oh5 oh5Var, gi1 gi1Var, gi1 gi1Var2) {
        this.a = l4b.y("\n        Expected response body of the type '" + gi1Var2 + "' but was '" + gi1Var + "'\n        In response from `" + oh5Var.y0().c().getUrl() + "`\n        Response status `" + oh5Var.e() + "`\n        Response header `ContentType: " + oh5Var.a().b("Content-Type") + "` \n        Request header `Accept: " + oh5Var.y0().c().a().b("Accept") + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
