package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d3e  reason: default package */
/* loaded from: classes.dex */
public enum d3e {
    DAI_INTEGRATION_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_NONE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_TRUMAN_STITCHED_MANIFEST_LINEAR(2),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_TRUMAN_STITCHED_MANIFEST_VOD(3),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_SEGMENT_REDIRECT_LINEAR(4),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_MANIFEST_LINEAR(5),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_MANIFEST_VOD(6),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_CLOUD_SEGMENT_REDIRECT_LINEAR(7),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_CLOUD_MANIFEST_VOD(8),
    UNRECOGNIZED(-1);
    
    public final int a;

    d3e(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }
}
