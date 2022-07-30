# Tree

- 나무의 계층적 자료구조를 표현 (Represent The Hierarchy of trees)
- 재귀적 알고리즘을 사용할때 쓰기 좋은 자료구조 중 하나임. (It is one of the best data structure to use when to use recursive algorithms)

## 쓰이는 용어

**Node**: 실제로 트리에 저장되는 데이터 구조
**Root Node**: 최상위에 위치한 데이터
**Branch Node**: Root Node 와 Leaf Node 사이에 위치한 데이터.
**Leaf Node**: 가장 말단에 위치한 데이터

**부모-자식 관계**: 연결된 노드들의 상대적 관계. 이걸 보면서 Class 상속 구조도 Tree 로 되어 있을거고, Recursive Algorithm 을 통해 구현했겠구나 라는 생각이 들었다. Implements 는 부모가 1인 부분이 아닌 것 같아서.. Graph 구조일까? 라는 생각을 했다.

**depth**: 특정 Node 에서 Root Node 까지의 Length
**height**: 노드 -> 리프 경로까지의 최대 길이 **(Max-Length)**
**sub-tree**: 어떤 노드 아래의 모든 것을 포함하는 트리 (이걸 구하는 알고리즘을 생각해보면 왜 Tree 가 Recursive 한지 알게됨.)