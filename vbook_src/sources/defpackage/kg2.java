package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kg2  reason: default package */
/* loaded from: classes.dex */
public class kg2 extends IOException {
    public final int a;

    public kg2(int i) {
        this.a = i;
    }

    public kg2(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public kg2(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
