package defpackage;

import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tff  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tff implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ tff(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    e60 e60Var = wff.C;
                    throw null;
                }
                throw new ClassCastException();
            default:
                throw s21.i(obj);
        }
    }
}
