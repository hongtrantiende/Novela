package defpackage;

import java.nio.charset.MalformedInputException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pfc  reason: default package */
/* loaded from: classes3.dex */
public final class pfc extends MalformedInputException {
    public final String a;

    public pfc(String str) {
        super(0);
        this.a = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
