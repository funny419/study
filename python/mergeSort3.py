def mergeSort(list):
    n = len(list)

    # 종료 조건 : 정렬할 리스트의 자료 개수가 한 개 이하이면 정렬할 필요 없음
    if n <= 1:
        return list

    # 그룹을 나누어 각각 병합 정렬을 호출하는 과정
    ## 중간을 기점으로 두 그룹으로 나눔
    mid = n // 2
    ## 재귀 호출로 첫 번째(왼쪽) 그룹을 정렬
    leftGroup = mergeSort(list[:mid])
    ## 재귀 호출로 두 번째(오른쪽) 그룹을 정렬
    rightGroup = mergeSort(list[mid:])
    

    # 두 그룹을 하나로 병합
    ## 두 그룹을 합쳐 만들 최종 결과
    result = []
    ## 두 그룹에 모두 자료가 남아 있는 동안 반복
    while leftGroup and rightGroup:
        #print(leftGroup[0],rightGroup[0])

        ## 두 그룹의 맨 앞 자료 값을 비교
        if leftGroup[0] < rightGroup[0]:
            ## leftGroup의 값이 더 작으면 그 값을 빼내어 결과로 추가
            result.append(leftGroup.pop(0))
        else:
            ## rightGroup의 값이 더 작으면 그 값을 빼내어 결과로 추가
            result.append(rightGroup.pop(0))

        print("#1 RESULT => ",result);

    # 아직 남아 있는 자료들을 결과에 추가
    ## leftGroup과 rightGroup 중 이미 빈 것은 while을 바로 지나감
    while leftGroup:
        result.append(leftGroup.pop(0))

    print("#2 RESULT => ",result);

    while rightGroup:
        result.append(rightGroup.pop(0))

    print("#3 RESULT => ",result);

    return result;

list = [6,8,3,9,10,1,2,4,7,5]
print(mergeSort(list))

# 1. 숫자 열 개를 두 그룹(leftGroup,rightGroup)으로 나눕니다.
## mid = 5
## leftGroup : [6,8,3,9,10]
## rightGroup : [1,2,4,7,5]

# 2. 두 그룹을 각각 정렬합니다. (재귀호출)
## leftGroup : [3,6,8,9,10]
## rightGroup : [1,2,4,5,7]

# 3. 이젠 두 그룹을 합쳐서 하나의 그룹으로 만듭니다.(병합)
# 각 그룹의 첫 번째 값을 비교하여 작은 값을 빼내어 결과 리스트로 보냅니다.
## leftGroup : [3,6,8,9,10]
## rightGroup : [2,4,5,7]
## 결과 : [1]

# 4. 3번 과정을 반복합니다.
## leftGroup : [3,6,8,9,10]
## rightGroup : [4,5,7]
## 결과 : [1,2]
## leftGroup : [6,8,9,10]
## rightGroup : [4,5,7]
## 결과 : [1,2,3]

# 5. 이 과정을 반복하다 보면 언젠가 한 그룹의 자료가 다 빠져나가게 됩니다.
## leftGroup : [8,9,10]
## rightGroup : []
## 결과 : [1,2,3,4,5,6,7]

# 6. 그럼 rightGroup에는 아무것도 남지 않았으므로 더 이상 비교할 필요 없이 leftGroup 변수들을 결과 리스트로 넣으면 병합 정렬은 끝나게 됩니다.
## leftGroup : []
## rightGroup : []
## 결과 : [1,2,3,4,5,6,7,8,9,10]

